package testapp;

public class HelloThere {
    public HelloThere() {
        super();
    }

    public static void main(String[] args) {
        HelloThere class1 = new HelloThere();
        class1.hello();
    }
    
    /**
     * Say hello
     */
    public void hello() {
        System.out.println("Hi");
    }
    
    public void hello3() {
        System.out.println("Hi3");
    }
}
