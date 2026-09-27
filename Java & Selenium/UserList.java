import java.util.ArrayList;

public class UserList {

    public static void main(String[] args) {

        ArrayList<String> users = new ArrayList<>();

        users.add("standard_user");
        users.add("problem_user");
        users.add("locked_out_user");
        users.remove("locked_out_user");

        System.out.println(users);
        System.out.println(users.size());
    }
}