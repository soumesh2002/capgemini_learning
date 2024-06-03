import java.util.Scanner;
import java.util.Arrays;
public class UserInterface {
    public static boolean isValidSentence(String s) {
        return s.matches("^[a-z ]*$");
    }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine().toLowerCase();
        
        if (!isValidSentence(sentence)) {
            System.out.println(sentence + " is an invalid input");
            return;
        }
        
        String[] sentenceSplit = sentence.split(" ");
        
        for (int i = 0; i < sentenceSplit.length; i++) {
            char[] ch = sentenceSplit[i].toCharArray();
            Arrays.sort(ch);
            
            sentenceSplit[i] = new String(ch);
        }
        
        String newString = String.join(" ", sentenceSplit);
        System.out.println(newString);
        
	}
}
