import java.sql.Time;
import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int nt = sc.nextInt();
        sc.close();

        if (nt < 2) {
            System.out.println(nt + " is an invalid input");
            return;
        }

        String winningTeam = "";
        float winningTime = Float.MAX_VALUE;

        System.out.println("Enter the details");
        for (int i = 0; i <= nt; i++) {
            String info = sc.nextLine();
            String[] details = info.split(":");

            if (details.length == 5) {
                String teamName = details[0];
                Float TimeTakenByMember1 = Float.parseFloat(details[1]);
                Float TimeTakenByMember2 = Float.parseFloat(details[2]);
                Float TimeTakenByMember3 = Float.parseFloat(details[3]);
                Float TimeTakenByMember4 = Float.parseFloat(details[4]);

                if (TimeTakenByMember1 < 1 || TimeTakenByMember2 < 1 || TimeTakenByMember3 < 1
                        || TimeTakenByMember4 < 1) {
                    System.out.println("Invalid number");
                    return;
                }

                float totalTime = TimeTakenByMember1 + TimeTakenByMember2 + TimeTakenByMember3 + TimeTakenByMember4;

                if (totalTime < winningTime) {
                    winningTime = totalTime;
                    winningTeam = teamName;
                }
            }
        }
        System.out.printf("%s team wins the race in %.2f minutes\n", winningTeam, winningTime);
    }
}
