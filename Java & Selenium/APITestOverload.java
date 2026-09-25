public class APITestOverload {
    void validateResponse(int statusCode){
        System.out.println("Validating response with status code: " + statusCode);
    }
    void validateResponse(int statusCode, int responseTime){
        System.out.println("Validating response with status code: " + statusCode + " and response time: " + responseTime + "ms");
    }
    void validateResponse(int statusCode, int responseTime, String endpoint){
        System.out.println("Validating response with status code: " + statusCode + ", response time: " + responseTime + "ms, and endpoint: " + endpoint);
    }

    public static void main(String[] args) {
        APITestOverload apiTest = new APITestOverload();

        apiTest.validateResponse(200);
        apiTest.validateResponse(200, 300);
        apiTest.validateResponse(200, 300, "/api/login");
    }
}
