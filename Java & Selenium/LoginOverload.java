public class LoginOverload {
    void login() {
        System.out.println("Login test executed");
    }

    void login(String username, String password) {
        System.out.println("Login test executed with username: " + username + " and password: " + password);
    }

    public static void main(String[] args) {

        LoginOverload test = new LoginOverload();

        test.login();
        test.login("standard_user", "secret_sauce");
    }
}