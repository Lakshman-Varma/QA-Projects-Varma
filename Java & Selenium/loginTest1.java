public class loginTest1 extends TestBase1 {

    void login() {
        System.out.println("Login test executed");
    }

    public static void main(String[] args) {

        loginTest1 test = new loginTest1();

        test.setup();
        test.login();
    }
    
}
