public class AdminLoginTest1 extends loginTest1 {

    void adminLogin() {
        System.out.println("Admin login test executed");
    }

    public static void main(String[] args) {

        AdminLoginTest1 test = new AdminLoginTest1();

        test.setup();
        test.login();
        test.adminLogin();
    }
    
}
