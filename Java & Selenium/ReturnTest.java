public class ReturnTest {

    public static void main(String[] args) {

        boolean result1 = loginTest("standard_user");
        boolean result2 = loginTest("problem_user");
        boolean result3 = loginTest("locked_out_user");

        System.out.println("standard_user: " + result1);
        System.out.println("problem_user: " + result2);
        System.out.println("locked_out_user: " + result3);
    }

    public static boolean loginTest(String user) {

        if (user.equals("locked_out_user")) {
            return false;
        } else {
            return true;
        }
    }
}