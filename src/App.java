import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception, RuntimeException {
        // int arr[] = {};
        // System.out.println(arr[0]);

        // String str = "welcome";
        // str.toUpperCase();
        // String S1 = str.replace('C', 'c');
        // S1 = S1 + " to Java";
        // System.out.println(S1);

        String[] cities = new String[] { "London", "Paris", "NewYork", "HongKong", "Tokyo" };

        String[] metros = new String[] { "London", "Paris", "NewYork", "HongKong", "Tokyo" };

        String[] captials = cities;

        System.out.println(cities.equals(captials));
        System.out.println(Arrays.equals(cities, metros));

        // int[] arr = {12, 4, 22, 5, 1, 66};
        // Arrays.sort(arr);
        // int position = Arrays.binarySearch(arr, 5);
        // System.out.println(position);

        // String str = NULL;
        // System.out.println(str);
    }
}
