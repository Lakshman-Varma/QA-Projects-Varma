public class NullException {

    public static void main(String[] args) {

        String username = null;

        try {
            System.out.println(username.length());

        } catch (NullPointerException e) {
            System.out.println("Username value is null");

        } finally {
            System.out.println("Test execution completed");
        }
    }
}