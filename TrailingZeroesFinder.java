/*
Implement a problem of smallest number with at least no trailing zeroes in factorial.   
Statement: Given a number n. The task is to find the smallest number whose factorial contains at least n trailing zeroes
*/
import java.util.Scanner;

public class TrailingZeroesFinder {

    // Function to count trailing zeroes in x!
    public static int countTrailingZeroes(int x) {
        int count = 0;
        while (x > 0) {
            x /= 5;
            count += x;
        }
        return count;
    }
   
    // Function to find the smallest number whose factorial has at least n trailing zeroes
    public static int findSmallestNumber(int n) {
        int low = 0, high = 5 * n;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int zeroes = countTrailingZeroes(mid);

            if (zeroes >= n) {
                result = mid;        // potential answer
                high = mid - 1;      // try to find a smaller one
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of trailing zeroes required: ");
        int n = sc.nextInt();

        int result = findSmallestNumber(n);
        System.out.println("Smallest number whose factorial has at least " + n + " trailing zeroes is: " + result);

        sc.close();
    }
}
