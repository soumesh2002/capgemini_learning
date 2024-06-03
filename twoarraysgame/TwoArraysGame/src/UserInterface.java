import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * [1, 2, 3, 4]
         * [2, 4, 6, 8]
         * 
         * [3, -2, 9, -4]
         */

        System.out.println("Enter the size for the first array");
        int fsarr = sc.nextInt();

        if (fsarr <= 0) {
            System.out.println(fsarr + " is an invalid array size");
            return;
        }

        System.out.println("Enter the elements for the first array");
        int[] firstarr = new int[fsarr];
        for (int i = 0; i < fsarr; i++) {
            firstarr[i] = sc.nextInt();
        }

        System.out.println("Enter the size for the second array");
        int secarr = sc.nextInt();

        if (secarr <= 0) {
            System.out.println(secarr + " is an invalid array size");
            return;
        }

        System.out.println("Enter the elements for the second array");
        int[] secondarr = new int[secarr];
        for (int i = 0; i < secarr; i++) {
            secondarr[i] = sc.nextInt();
        }

        if (secondarr.length != firstarr.length) {
            System.out.println("Both array size are not same");
            return;
        }

        int[] thirdarr = new int[fsarr];
        for (int i = 0; i < fsarr; i++) {
            if (i % 2 == 0) {
                thirdarr[i] = firstarr[i] + secondarr[i];
            } else {
                thirdarr[i] = firstarr[i] - secondarr[i];
            }
        }

        System.out.println("The elements of the third array");
        for (int x : thirdarr) {
            System.out.println(x);
        }
    }
}