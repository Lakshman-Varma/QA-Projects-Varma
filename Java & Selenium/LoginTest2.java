public class LoginTest2 extends TestBase2 {
    void setup() {
        System.out.println("Login setup");
    }
    void runlogintest() {
        super.setup();
        System.out.println("Login test executed");
    }
    public static void main(String[] args) {
        LoginTest2 test = new LoginTest2();
        test.setup();
        test.runlogintest();
    }
    
}
