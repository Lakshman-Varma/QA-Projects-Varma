public class ClassUsersTest {

    public static void main(String[] args) {

        ClassUser user1 = new ClassUser();
        ClassUser user2 = new ClassUser();

        user1.username = "standard_user";
        user1.password = 12345;
        user1.ID = 1;

        user2.username = "problem_user";
        user2.password = 67890;
        user2.ID = 2;

        System.out.println(user1.username);
        System.out.println(user1.password);
        System.out.println(user1.ID);

        System.out.println(user2.username);
        System.out.println(user2.password);
        System.out.println(user2.ID);
    }
}