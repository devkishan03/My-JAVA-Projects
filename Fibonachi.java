package Assignment;

import java.util.Scanner;

public class Fibonachi {

    public static void printFibo(int n) {
        int a = 0;
        int b = 1;
        if (n < 3) {
            System.out.println("Fibonachi series of " + n + " numbers:");
            System.out.println(a + "," + b);
        } else
            System.out.print("Fibonachi series of " + n + " numbers:");
        System.out.print(a + "," + b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print("," + c);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of series:");
        int n = sc.nextInt();
        printFibo(n);
        sc.close();
    }
}
