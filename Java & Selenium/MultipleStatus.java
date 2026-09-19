public class MultipleStatus {
    static String getStatusMessage(int statusCode)
    {
        if (statusCode == 200) {
            return "Success";
        } else if (statusCode == 401) {
            return "Unauthorized";
        } else if (statusCode == 403) {
            return "Forbidden";
        } else if (statusCode == 404) {
            return "Not Found";
        } else if (statusCode == 500) {
            return "Internal Server Error";
        } else {
            return "Unknown Status Code";
        }
    }
    public static void main(String[] args) {

    System.out.println(getStatusMessage(200));
    System.out.println(getStatusMessage(403));
    System.out.println(getStatusMessage(500));

}
}
