// Write a java class with a private instance variable and a method that takes a parameter with the same name as the
// instance variable. Use the 'this' keyword to differentiate between the instsance variable and the parameter.

public class prog07 {
    private int a;
    
    void setter(int a) {
        this.a = a;
    }

    void getter() {
        System.out.println("a = " + this.a);
    }

    public static void main(String[] args) {
        prog07 obj = new prog07();
        obj.setter(100);
        obj.getter();
    }
}
