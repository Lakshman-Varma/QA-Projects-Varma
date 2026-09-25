public class LoginTest7 extends TestBase7 {
    @Override
    void login() {
        System.out.println("Login test executed");
    }

    @Override
    void logout() {
        System.out.println("Logout test executed");
    }

    public static void main(String[] args) {
        LoginTest7 test = new LoginTest7();
        test.setup();
        test.login();
        test.logout();
    }
    
}
