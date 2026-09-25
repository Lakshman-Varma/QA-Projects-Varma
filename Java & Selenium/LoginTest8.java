public class LoginTest8 implements TestActions, TestWebActions {
    @Override
    public void login() {
        System.out.println("Login test executed");
    }

    @Override 
    public void openBrowser() {
        System.out.println("Browser opened");
    }

    @Override
    public void logout() {
        System.out.println("Logout test executed");
    }

    public static void main(String[] args) {
        LoginTest8 test = new LoginTest8();
        test.login();
        test.openBrowser();
        test.logout();
    }
    
}
