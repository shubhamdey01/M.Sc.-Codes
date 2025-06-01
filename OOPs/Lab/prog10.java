// Create a java class with both static and instance methods. Inside the instance method,
// demonstrate the use of 'this' to access instance variables and invoke another instance method.

public class prog10 {
    private int x;

    static void staticMethod(){
        System.out.println("Static Method");
    }

    void method1(int x) {
        this.x = x;
        System.out.println("Instance Method 1");
        this.method2();
    }
    
    void method2() {
        System.out.println("Instance Method 2,\tX = " + this.x);
    }

    public static void main(String[] args) {
        staticMethod();
        prog10 obj = new prog10();
        obj.method1(111);
    }
}
