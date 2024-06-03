import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fill the code here
        System.out.println("Enter the array size");
        int arraySize = sc.nextInt();

        if (arraySize < 1 || arraySize > 5) {
            System.out.println(arraySize + " is an invalid array size");
            return;
        }

        int[] number = new int[arraySize];
        System.out.println("Enter the numbers");

        for (int i = 0; i < arraySize; i++) {
            number[i] = sc.nextInt();
            if (number[i] < 1 || number[i] > 99) {
                System.out.println(number[i] + " is an invalid input");
                return;
            }
        }

        boolean hasPrimeSum = false;
        for (int num : number) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                int sum = 0;
                int j = 2;
                while (sum < num) {
                    boolean temp = true;
                    for (int k = 2; k <= Math.sqrt(j); k++) {
                        if (j % k == 0) {
                            temp = false;
                            break;
                        }
                    }
                    if (temp) {
                        sum += j;
                    }
                    if (sum == num) {
                        if (!hasPrimeSum) {
                            System.out.println("The sum of prime numbers is");
                            hasPrimeSum = true;
                        }
                        System.out.println(num);
                        break;
                    }
                    j++;
                }
            }
        }
        if (!hasPrimeSum) {
            System.out.println("The " + arraySize + " numbers are not sum of prime numbers");
        }
    }
}