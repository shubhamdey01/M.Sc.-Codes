// Write a java program to check whether a given number is Peterson Number or not.

import java.util.Scanner;

class PetersonNo {
    private int num;

    PetersonNo(int num) {
        this.num = num;
    }

    private int factorial(int n) {
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }

    boolean check() {
        int sum = 0, temp = num;
        while(temp > 0) {
            sum += factorial(temp%10);
            temp /= 10;
        }
        return sum == num;
    }
}

public class prog06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :\t");
        int num = sc.nextInt();
        PetersonNo obj = new PetersonNo(num);
        if(obj.check())
            System.out.println(num + " is a Peterson Number.");
        else
            System.out.println(num + " is not a Peterson Number.");
    }
}
