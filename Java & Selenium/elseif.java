public class elseif {

    public static void main(String[] args) {

        int statusCode = 404;

        if (statusCode == 200) {
            System.out.println("Login successful");
        } 
        else if (statusCode == 401) {
            System.out.println("Invalid username or password");
        } 
        else if (statusCode == 403) {
            System.out.println("Account is locked");
        } 
        else if (statusCode == 500) {
            System.out.println("Server error");
        } 
        else {
            System.out.println("Unknown status code");
        }
    }
}