public class LoginTest3 extends TestBase3 {

    LoginTest3() {
        super();
        System.out.println("Login constructor executed");
    }

    void runLoginTest() {
        System.out.println("Login test executed");
    }

    public static void main(String[] args) {

        LoginTest3 test = new LoginTest3();

        test.runLoginTest();
    }
}