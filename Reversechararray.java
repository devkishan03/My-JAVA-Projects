package Assignment;

import java.util.Scanner;

public class Reversechararray {

    public static char[] reverseCharArray(char arr[]) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
        return arr;
    }

    public static void printArray(char arr[]) {
        for (char c : arr) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter how many char want to input:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char ch[] = new char[n];
        System.out.println("enter characters:");
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i);
        }
        System.out.println("Reverse order willbe:");
        reverseCharArray(ch);
        printArray(ch);

    }
}
