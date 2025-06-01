// Define a class with an inner class. Inside the inner class, use the 'this' keyword to refer to the instance
// of the outer class. Demonstrate how this works in context of inner classes.

class OuterClass {
    private int outVar = 22;

    OuterClass() {
        System.out.println("Outer Class, outVar = " + this.outVar);

        InnerClass obj = new InnerClass();
        obj.innerMethod();
    }
    class InnerClass {
        private int inVar = 55;

        void innerMethod() {
            System.out.println("Inner Class, inVar = " + this.inVar);
            System.out.println("Inner Class, outVar = " + OuterClass.this.outVar);
        }
    }
}

public class prog12 {
    public static void main(String[] args) {
        new OuterClass();
    }
}
