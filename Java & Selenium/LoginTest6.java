public class LoginTest6 extends TestBase6 {
    @Override
    void login() {
        System.out.println("Login test executed");
    }
    public static void main(String[] args) {
        LoginTest6 test = new LoginTest6();
        test.setup();
        test.login();
    }
}
