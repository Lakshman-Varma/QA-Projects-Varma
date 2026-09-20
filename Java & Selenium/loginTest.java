public class loginTest extends TestBase {

    void login() {
        System.out.println("Login test executed");
    }

    public static void main(String[] args) {

        loginTest test = new loginTest();

        test.setup();
        test.login();
    }
}