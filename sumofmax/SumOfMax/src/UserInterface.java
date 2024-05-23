import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {

    public static int max_sum(int[] arr) {
        Arrays.sort(arr);

        int maxSum = 0;
        int m = 0;
        int n = arr.length - 1;

        while (m < n) {
            maxSum = Math.max(maxSum, arr[m] + arr[n]);
            m++;
            n--;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int S = sc.nextInt();

        if (S > 1 && S % 2 == 0) {
            int[] a = new int[S];
            System.out.println("Enter the number");
            for (int x = 0; x < S; x++) {
                int n = sc.nextInt();
                a[x] = n;
            }
            System.out.println("The maximum number is " + max_sum(a));

        } else if (S <= 0) {
            System.out.println(S + " is an invalid array size");
            return;
        } else {
            System.out.println(S + " is an odd number.Please enter even number");
            return;
        }
    }
}