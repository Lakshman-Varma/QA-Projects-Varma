public class EncapTest {
    public static void main(String[] args) {
        EncapUser user1 = new EncapUser("standard_user", "secret_sauce");
        EncapUser user2 = new EncapUser("locked_out_user", "secret_sauce");
        System.out.println(user1.getUsername());
        
        user1.setUsername("problem_user");
        System.out.println(user1.getUsername());
        
        System.out.println(user1.getPassword());
        System.out.println(user2.getUsername());
        System.out.println(user2.getPassword());
    }
}
    