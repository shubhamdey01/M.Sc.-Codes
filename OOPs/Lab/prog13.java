// Implement a copy constructor for a class that creates a new object with the same state as another object.
// Use 'this' keyword to reference the current object and the passed object.

public class prog13 {
    private int x;

    prog13(int x) {
        this.x = x;
    }

    prog13(prog13 obj) {
        this.x = obj.x;
    }

    void getter() {
        System.out.println("X = " + this.x);
    }

    public static void main(String[] args) {
        prog13 original = new prog13(100);
        System.out.println("Original object -");
        original.getter();
        prog13 copy = new prog13(original);
        System.out.println("\nCopy object -");
        copy.getter();
    }
}
