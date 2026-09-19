public class MethodsLogin {
    static void login(String username, String password) {
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
    System.out.println("Login test Executed");
}

    public static void main(String[] args) {
        login("standard_user", "secret_sauce");
        login("problem_user", "secret_sauce");
}
}