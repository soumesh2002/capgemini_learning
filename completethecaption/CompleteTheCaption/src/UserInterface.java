import java.util.Scanner;
public class UserInterface {
    
    public static boolean isValidString(String s) {
        return s.matches("^[a-zA-z! ]*$");
    }
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first string");
       String fs = sc.nextLine();
       
       System.out.println("Enter the second string");
       String ss = sc.nextLine();
       
        if (fs.length() != ss.length()) {
           System.out.println("Length of the strings " + fs + " and " + ss + " does not match");
           return;
           
       }
       
        if (!isValidString(fs) && !isValidString(ss)) {
           System.out.println(fs + " and " + ss + " contains invalid symbols");
           return;
        } 
        else if (!isValidString(fs)) {
           System.out.println(fs + " contains invalid symbols");
           return;
        }
        else if (!isValidString(ss)) {
           System.out.println(ss + " contains invalid symbols");
           return;
        }  else {
        //   String result = "";
        //   int x = 0;
           
        //   for (String s : firstString) {
        //       result += s;
               
        //       if (s.isEmpty() && x < secondString.length) {
        //           while (x < secondString.length && secondString[x].equals('!')) {
        //               x++;
        //           }
        // F!n! !ut
        // !i!d O!!
        // Fni d Out
                   
        //           if (x < secondString.length) {
        //               result += secondString[x++];
        //           }
        //       }
        //   }
           
        //   System.out.println(result);
        
            // String result = "";
            // int x = 0;
            
            // for (int i = 0; i < firstString.length; i++) {
            //     result += firstString[i];
                
            //     if (i < secondString.length) {
            //         result += secondString[i];
            //     }
            // }
            
            // System.out.println(result.trim());
            
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < fs.length(); i++) {
                char ch1 = fs.charAt(i);
                char ch2 = ss.charAt(i);
                
                if (ch1 == '!') {
                    sb.append(ch2);
                } else {
                    sb.append(ch1);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
