import java.util.Scanner;

public class UserInterface {
	public static boolean isValidSentence(String[] words) {
		for (String word : words) {
			for (char c : word.toCharArray()) {
				if (!Character.isLetter(c) && c != ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public static String reverseWord(String word) {
		char[] chars = word.toCharArray();
		int left = 0;
		int right = chars.length - 1;

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}

		return String.valueOf(chars);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();

		String[] words = sentence.split(" ");

		if (words.length < 3) {
			System.out.println("Invalid Length");
			return;
		}

		if (!isValidSentence(words)) {
			System.out.println(sentence + " is an invalid sentence");
			return;
		}

		String temp = words[0];
		words[0] = words[words.length - 1];
		words[words.length - 1] = temp;

		for (int i = 1, j = words.length - 2; i < j; i++, j--) {
			String tempWord = reverseWord(words[i]);
			words[i] = reverseWord(words[j]);
			words[j] = tempWord;
		}

		if ((words.length - 2) % 2 != 0) {
			words[(words.length - 1) / 2] = reverseWord(words[(words.length - 1) / 2]);
		}

		String modifiedString = String.join(" ", words);
		System.out.println(modifiedString);
	}

}
