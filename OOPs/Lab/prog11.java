// Define a class with a parametrized constructor and an instance method. Inside the method use 'this' keyword
// to call the constructor and pass values.Create an object of the class and invoke the method.

public class prog11 {
    private int x;

    prog11(int x) {
        this.x = x;
        System.out.println("Constructor,\tX = " + this.x);
    }

    void setter(int x) {
        this(x);
        System.out.println("Instance Method,\tX = " + this.x);
    }

    public static void main(String[] args) {
        prog11 obj = new prog11(11);
        obj.setter(111);
    }
}