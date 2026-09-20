public class LoginAPITest extends APITestBase {

    void ValidateLogin() {
        System.out.println("Login API Validation completed ");
    }

    public static void main(String[] args) {

        LoginAPITest test = new LoginAPITest();

        test.setup();
        test.sendRequest();
        test.ValidateLogin();
        
    }
    
}
