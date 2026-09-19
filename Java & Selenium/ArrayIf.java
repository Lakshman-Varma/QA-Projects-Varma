public class ArrayIf {
    public static void main(String[] args) {
       String[] users = { 
            "standard_user",
            "locked_out_user",
            "problem_user",
            "performance_glitch_user",
            "error_user",
            "visual_user"
        };

        for (String user : users) {
            if (user.equals("locked_out_user")) {
                System.out.println(user + " Account is locked");
            } else {
                System.out.println(user + " Login test can proceed");
            }
        }
    }
}
