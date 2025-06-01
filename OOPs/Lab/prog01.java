// Write a java program to create a simple calculator. This calculator should perform +, -, *, /, %.
import java.util.Scanner;

class SimpleCalculator {
    int a, b;
    SimpleCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void add() {
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    void subtract() {
        System.out.println(a + " - " + b + " = " + (a-b));
    }
    void multiply() {
        System.out.println(a + " * " + b + " = " + (a*b));
    }
    void divide() {
        System.out.println(a + " / " + b + " = " + ((float)a/b));
    }
    void remainder() {
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}

public class prog01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        SimpleCalculator obj;
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();
        obj = new SimpleCalculator(a, b);
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
        obj.remainder();
        sc.close();
    }    
}