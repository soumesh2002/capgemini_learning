import java.util.*;

public class UserInterface {

    public String getDuplicateElement(int sizeOfArray, int[] arr, int position) {
        try {
            if (sizeOfArray < 0) {
                throw new NegativeArraySizeException();
            }

            if (position < 1 || position > arr.length) {
                return "Invalid Length";
            }

            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[arr.length] = arr[position];

            StringBuilder result = new StringBuilder();
            for (int element : newArr) {
                result.append(element).append(" ");
            }
            return result.toString().trim();
        } catch (NegativeArraySizeException ne) {
            return "Array size should be positive";
        } catch (ArrayIndexOutOfBoundsException ae) {
            return "Array index is out of range";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInterface ui = new UserInterface();

        try {
            System.out.println("Enter the size of an array");
            int sizeOfArray = sc.nextInt();

            if (sizeOfArray < 0) {
                throw new NegativeArraySizeException();
            }

            int[] arr = new int[sizeOfArray];
            System.out.println("Enter the array elements");
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the position of the element to be replicated");
            int position = sc.nextInt();

            String result = ui.getDuplicateElement(sizeOfArray, arr, position);

            System.out.println("The array elements are " + result);

        } catch (InputMismatchException e) {
            System.out.println("Input was not in the correct format");
            sc.nextLine();
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size should be positive");
        }
    }
}
