public class logicOperators {
    public static void main(String[] args) {
    int statusCode = 200;
    int responseTime = 300;

if (statusCode == 200 && responseTime > 500) {
    System.out.println("API Test Passed");
} else {
    System.out.println("API Test Failed");
}
    }
}
