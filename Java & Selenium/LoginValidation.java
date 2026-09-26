public class LoginValidation  {

    static void validateLogin(boolean success) throws Exception {

        if (!success) {
            throw new Exception("Login failed");
        }

        System.out.println("Login successful");
    }
    public static void main(String[] args) {
        try {
            validateLogin(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}