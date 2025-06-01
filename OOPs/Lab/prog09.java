// Design a class representing a geometric shape (e.g. Rectangle) with instance variable for dimensions.
// Implement a method that scales the dimensions by a factor and returns the current object using 'this' keyword.

class Rectangle {
    private double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void scale(float x) {
        this.l *= x;
        this.b *= x;
    }

    void getter() {
        System.out.println("Length = " + this.l + "\tBreadth = " + this.b);
    }
}

public class prog09 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(100.0, 25.0);
        System.out.println("Original -");
        obj.getter();
        obj.scale(1.5f);
        System.out.println("\nModified -");
        obj.getter();
    }
}
