import java.util.*;

class PinValidator {
    private int pin;

    public PinValidator(int pin) {
        this.pin = pin;
    }

    public boolean isValidLength() {
        return 0 < this.pin && this.pin <= 9999;
    }

    public boolean isValidPin() {
        // int[] digits = new int[4];
        // int tempPin = pin;
        // for (int i = 3; i >= 0; i--) {
        // digits[i] = tempPin % 10;
        // tempPin = tempPin / 10;
        // }

        // 1234 -> 49, 50, 51, 52
        // int[] digits = Integer.toString(this.pin).chars().map(c -> c -
        // '0').toArray();
        String pinString = Integer.toString(this.pin);
        int[] digits = new int[pinString.length()];
        for (int i = 0; i < pinString.length(); i++) {
            digits[i] = pinString.charAt(i) - '0';
        }
        return digits.length == 4 && isOdd(digits[0]) && isEven(digits[1]) && isPrime(digits[2])
                && isComposite(digits[3]);
    }

    private boolean isOdd(int n) {
        return n % 2 != 0;
    }

    private boolean isEven(int n) {
        return n % 2 == 0;
    }

    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean validate() {
        return isValidLength() && isValidPin();
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of PIN numbers");
        int totalPins = sc.nextInt();

        if (totalPins <= 0) {
            System.out.println(totalPins + " is an invalid number");
            return;
        }

        System.out.println("Enter the PIN numbers");
        List<Integer> vp = new ArrayList<>();

        for (int i = 0; i < totalPins; i++) {
            int pin = sc.nextInt();
            if (Integer.toString(pin).length() < 4 || Integer.toString(pin).length() > 4) {
                System.out.println(pin + " is an invalid PIN number");
                return;
            }

            PinValidator validator = new PinValidator(pin);
            if (validator.validate()) {
                vp.add(pin);
            }
        }

        if (vp.isEmpty()) {
            System.out.println("All these " + totalPins + " numbers are not a valid PIN number");
        } else {
            System.out.println("Valid PIN numbers are");
            for (int x : vp) {
                System.out.println(x);
            }
        }
    }
}