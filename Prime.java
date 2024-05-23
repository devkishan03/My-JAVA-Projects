package Assignment;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        if (n < 4) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printNumbers(int arr[], int n) {
        System.out.println("Prime numbers b/w this range willbe:");
        for (int i = 0; i < n; i++) {
            System.out.println((arr[i]));
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter starting and ending range of numbers:");
        Scanner sc = new Scanner(System.in);
        int start, end;
        start = sc.nextInt();
        end = sc.nextInt();

        System.out.println("Enter how many prime numbers want to find:");
        int n = sc.nextInt();
        sc.close();

        int primeNumbers[] = new int[n];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                if (index > n - 1) {
                    break;
                } else {
                    primeNumbers[index] = i;
                    index++;
                }
            }
        }

        printNumbers(primeNumbers, index);

    }
}
