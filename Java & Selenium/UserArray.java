import java.util.ArrayList;

public class UserArray {
 public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();

    users.add("standard_user");
    users.add("problem_user");
    users.add("locked_out_user");

    for (String user : users) {

    System.out.println("Testing User: " + user);
    //System.out.println("Login Should be Successfull");
    if (user.equals("locked_out_user")) {
        System.out.println("Login Should fail - User is locked");
        }
        else {
            System.out.println("Login Should be Successfull");
        }
    }
}
}
