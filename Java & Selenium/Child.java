public class Child extends Parent {
    @Override 
    void setup() {
        System.out.println("Login setup");
    }
    void login() {
        System.out.println("Login test executed");
    }
    public static void main(String[] args) {
        Child test = new Child();
        test.setup();
        test.login();
    }
}
