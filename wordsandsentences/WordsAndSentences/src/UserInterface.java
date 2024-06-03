import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]) {
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the sentence");
	    String sentence = sc.nextLine();
	    
	    String[] sentenceSplit = sentence.split(" ");
	    
	    System.out.println("Enter the word");
	    String wordToFind = sc.nextLine();
	    
	    boolean isPresent = false;
	    for (String s : sentenceSplit) {
	        if (s.equals(wordToFind)) {
	            isPresent = true;
	            break;
	        }
	    }
	    
	    if (isPresent) {
	        System.out.println(wordToFind + " is present in the sentence");
	    } else {
	        System.out.println(wordToFind + " is not present in the sentence");
	    }
	}
}	
