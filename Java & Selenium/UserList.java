import java.util.ArrayList;

public class UserList {

    public static void main(String[] args) {

        ArrayList<String> users = new ArrayList<>();

        users.add("standard_user");
        users.add("problem_user");
        users.add("locked_out_user");
        users.set(1, "performance_glitch_user");
        //users.remove("locked_out_user");

        System.out.println(users);
        System.out.println(users.size());
        System.out.println(users.get(0));
        System.out.println(users.get(1));
        System.out.println(users.get(2));
        System.out.println(users.contains("standard_user"));
        System.out.println(users.contains("admin_user"));
    }
}