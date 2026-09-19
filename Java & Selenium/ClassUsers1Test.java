public class ClassUsers1Test {
    public static void main(String[] args) {
        ClassUser1 user1 = new ClassUser1("standard_user", "secret_sauce", 1);
        ClassUser1 user2 = new ClassUser1("problem_user", "secret_sauce", 2);

        System.out.println(user1.username);
        System.out.println(user1.password);
        System.out.println(user1.ID);

        System.out.println(user2.username);
        System.out.println(user2.password);
        System.out.println(user2.ID);
    }
}
