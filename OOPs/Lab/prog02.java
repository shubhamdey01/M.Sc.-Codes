// Write any program to create a matrix class. Define a constructor to create a 3x3 matrix object.
// Also define a method to find the maximum elements in a given matrix and assemble its position in the matrix.
// note - position of element means its location in terms of row and column.

import java.util.Scanner;

class Matrix {
    int[][] mat;
    int m, n;
    Scanner sc = new Scanner(System.in);

    Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        mat = new int[m][n];
    }
    
    void input() {
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                mat[i][j] = sc.nextInt();
    }

    void maximum() {
        int maxI = -1, maxJ = -1, max = Integer.MIN_VALUE;
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                if(mat[i][j] > max) {
                    max = mat[i][j];
                    maxI = i+1;
                    maxJ = j+1;
                }
        System.out.println("Maximum element = " + max + "\tPosition = (" + maxI + "," + maxJ + ")");
    }
}

public class prog02 {
    public static void main(String[] args) {
        Matrix obj = new Matrix(3, 3);
        System.out.println("Enter elements of 3x3 matrix :");
        obj.input();
        obj.maximum();
    }
}