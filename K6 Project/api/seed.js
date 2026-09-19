const db = require('./database');

const users = [
    ['standard_user', 'secret_sauce', 'active'],
    ['locked_out_user', 'secret_sauce', 'locked'],
    ['problem_user', 'secret_sauce', 'active'],
    ['performance_glitch_user', 'secret_sauce', 'active'],
    ['error_user', 'secret_sauce', 'active'],
    ['visual_user', 'secret_sauce', 'active']
];

const insert = db.prepare(`
    INSERT OR IGNORE INTO users (username, password, status)
    VALUES (?, ?, ?)
`);

const insertMany = db.transaction((users) => {
    for (const user of users) {
        insert.run(...user);
    }
});

insertMany(users);

console.log('Users inserted successfully');

const allUsers = db.prepare('SELECT * FROM users').all();

console.table(allUsers);

db.close();