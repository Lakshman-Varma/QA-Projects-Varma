public class MethodValidate {
    static boolean validateStatusCode(int statusCode) {
    // return true if statusCode is 200
    // otherwise return false
    if (statusCode == 200) {
        return true;
    } else {
        return false;
    }
}
public static void main(String[] args) {
    boolean result = validateStatusCode(200);
System.out.println(result);
}
}