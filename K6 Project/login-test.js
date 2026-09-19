import http from 'k6/http';
import { check, sleep } from 'k6';
import { Rate } from 'k6/metrics';

const unexpectedResponses = new Rate('unexpected_responses');

const BASE_URL = __ENV.BASE_URL || 'http://localhost:3000';

export const options = {
    vus: 5,
    duration: '10s',

    thresholds: {
        http_req_duration: ['p(95)<500'],
        checks: ['rate>=0.90'],
        unexpected_responses: ['rate<0.01'],
    },
};

const users = [
    {
        username: 'standard_user',
        password: 'secret_sauce',
        expectedStatus: 200,
    },
    {
        username: 'locked_out_user',
        password: 'secret_sauce',
        expectedStatus: 403,
    },
    {
        username: 'problem_user',
        password: 'secret_sauce',
        expectedStatus: 200,
    },
    {
        username: 'performance_glitch_user',
        password: 'secret_sauce',
        expectedStatus: 200,
    },
    {
        username: 'error_user',
        password: 'secret_sauce',
        expectedStatus: 200,
    },
    {
        username: 'visual_user',
        password: 'secret_sauce',
        expectedStatus: 200,
    },
];

export default function () {

    const user = users[(__VU + __ITER) % users.length];

    const payload = JSON.stringify({
        username: user.username,
        password: user.password,
    });

    const params = {
        headers: {
            'Content-Type': 'application/json',
        },
    };

    const response = http.post(
        `${BASE_URL}/auth/login`,
        payload,
        params
    );

    // Track unexpected HTTP responses
    unexpectedResponses.add(
        response.status !== user.expectedStatus
    );

    // Verify expected status
    check(response, {
        'HTTP status is correct': function (r) {
            return r.status === user.expectedStatus;
        },
    });

    // Verify response body
    check(response, {
        'response body is received': function (r) {
            return r.body !== '';
        },
    });

    // Verify successful login
    if (user.expectedStatus === 200) {

        check(response, {
            'login successful message': function (r) {
                return r.json('message') === 'Login successful';
            },
        });

    }

    console.log(
        user.username +
        ' | Expected: ' +
        user.expectedStatus +
        ' | Actual: ' +
        response.status
    );

    sleep(1);
}