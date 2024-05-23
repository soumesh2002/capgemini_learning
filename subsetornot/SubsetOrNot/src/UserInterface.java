import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {

    public static boolean issubsetornot(int[] P1, int[] P2, int p, int q) {
        int m = 0;
        int n = 0;

        Arrays.sort(P1);
        Arrays.sort(P2);

        for (m = 0; m < q; m++) {
            for (n = 0; n < p; n++) {
                if (P1[m] == P2[n])
                    break;
            }

            if (n == p)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array size");
        int A1 = sc.nextInt();

        System.out.println("Enter the numbers");
        int[] arr1 = new int[A1];
        int lenarr1 = arr1.length;
        for (int i = 0; i < lenarr1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the second array size");
        int A2 = sc.nextInt();

        System.out.print(
                (A1 < 0) ? A1 + " is an invalid array size" : (A2 < 0) ? A2 + " is an invalid array size" : "");

        if (A1 < 0 || A2 < 0) {
            return;
        }

        if (A2 > A1) {
            System.out.println(A2 + " is an invalid size as it is greater than first array size 2");
        } else {
            int[] arr2 = new int[A2];
            int lenarr2 = arr2.length;
            System.out.println("Enter the numbers");
            for (int i = 0; i < lenarr2; i++) {
                arr2[i] = sc.nextInt();
            }
            if (issubsetornot(arr1, arr2, A1, A2)) {
                System.out.println("Array2 of size " + lenarr2 + " is a subset of array1");
            } else {
                System.out.println("Array2 of size " + lenarr2 + " is not a subset of array1");
            }
        }
    }
}