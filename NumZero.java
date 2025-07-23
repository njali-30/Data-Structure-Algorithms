import java.util.Scanner;

public class NumZero {
    public static int calc(int[] arr) {
        int f = 0;
        int l = arr.length - 1;

        while (f <= l) {
            int mid = (f + l) / 2;

            if (arr[mid] == 0) {
                if (mid == 0 || arr[mid - 1] == 1) {
                    return arr.length - mid; 
                } else {
                    l = mid - 1; // Search left
                }
            } else {
                f = mid + 1; // Search right
            }
        }

        return 0; // No 0s found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements (1s preceding 0s): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = calc(arr);

        if (result == 0) {
            System.out.println("No 0s found in the array!");
        } else {
            System.out.println("Total number of 0s in the array: " + result);
        }

        sc.close();
    }
}
