public class LoginValidation1 {

    static void validateLogin(boolean success) throws InvalidLogin {

        if (!success) {
            throw new InvalidLogin("Invalid username or password");
        }

        System.out.println("Login successful");
    }

    public static void main(String[] args) {

        try {
            validateLogin(false);

        } catch (InvalidLogin e) {
            System.out.println(e.getMessage());
        }
    }
}