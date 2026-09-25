public class LoginTest4 extends TestBase4 {

    LoginTest4(String browser) {
        super(browser);
    }

    void runLoginTest() {
        System.out.println("Login test executed");
    }

    public static void main(String[] args) {
        LoginTest4 test = new LoginTest4("Chrome");
        test.runLoginTest();
    }
    
}
