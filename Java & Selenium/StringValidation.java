public class StringValidation {
    public static void main(String[] args) {

        String username = "standard_user";
        String password = "secret_sauce";
        
        if (username.contains("user")) {
    System.out.println("Username validation passed");
} else {
    System.out.println("Username validation failed");
}

        if (password.contains("sauce")) {
    System.out.println("Password validation passed");
} else {
    System.out.println("Password validation failed");
}
    }
}
