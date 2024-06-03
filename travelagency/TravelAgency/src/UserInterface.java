import java.util.Scanner;

public class UserInterface{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        String[] cities = {"Chennai", "Coimbatore", "Erode", "Karur", "Madurai", "Hyderabad", "Salem", "Bangalore", "Delhi", "Agra"};
        
        System.out.println("Enter the city name");
        String cityName = sc.nextLine();
        
        boolean busAvailable = false;
        for (String city : cities) {
            if (city.equalsIgnoreCase(cityName)) {
                busAvailable = true;
                break;
            }
        }
        
        if (busAvailable) {
            System.out.println("Bus for " + cityName + " is available");
        } else {
            System.out.println("Bus for " + cityName + " is not available");
        }
    }
}