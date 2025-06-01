// Create a java class with multiple constructors. Use 'this' keyword to implement constructor chaining,
// where one constructor calls another constructor with different parameter.

public class prog08 {
    private int a;
    private String s;

    prog08() {
        this(0);
    }

    prog08(int a) {
        this(a, "abc");
    }

    prog08(int a, String s) {
        this.a = a;
        this.s = s;
    }

    void getter() {
        System.out.println(this.a + "\t" + this.s + "\n");
    }

    public static void main(String[] args) {
        prog08 obj1 = new prog08();
        obj1.getter();
        prog08 obj2 = new prog08(10);
        obj2.getter();
        prog08 obj3 = new prog08(100, "hello");
        obj3.getter();
    }
}
