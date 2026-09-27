public class InTest {

    public static void main(String[] args) {

        loginTest("standard_user");
        loginTest("problem_user");
        loginTest("locked_out_user");
        }

    public static void loginTest(String user) {

        System.out.println("Testing User: " + user);

        if (user.equals("locked_out_user")) {
            System.out.println("Login should fail - User is locked");
        } else {
            System.out.println("Login should be successful");
        }
    }
}