import java.util.Scanner;

// public class UserInterface {

//     public static void main(String[] args) {
//         // String isFromNit;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Student's Id:");
//         int ID = sc.nextInt();
//         sc.nextLine();

//         System.out.println("Enter Student's Name:");
//         String studentName = sc.nextLine();

//         System.out.println("Enter Student's address:");
//         String addressName = sc.nextLine();

//         String isFromNIT;

//         while (true) {
//             System.out.println("Whether the student is from NIT(Yes/No):");
//             isFromNIT = sc.nextLine().toLowerCase();

//             if (isFromNIT.equals("yes") || isFromNIT.equals("no")) {
//                 break;
//             } else {
//                 System.out.println("Wrong input");
//             }
//         }

//         Student obj;

//         if (isFromNIT.equals("yes")) {
//             obj = new Student(ID, studentName, addressName);
//         } else {
//             System.out.println("Enter the college name:");
//             String collegeName = sc.nextLine();
//             obj = new Student(ID, studentName, addressName, collegeName);
//         }

//         System.out.println("Student id:" + obj.getStudentID());
//         System.out.println("Student name:" + obj.getStudentName());
//         System.out.println("Address:" + obj.getStudentAddress());
//         System.out.println("College name:" + obj.getCollegeName());
//     }
// }

public class UserInterface {

    public static void main(String[] args) {
        // Fill the code
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Id:");
        int studentId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Student's Name:");
        String studentName = sc.nextLine();

        System.out.println("Enter Student's address:");
        String studentAddress = sc.nextLine();

        String isFromNIT;

        while (true) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            isFromNIT = sc.nextLine().toLowerCase();

            if (isFromNIT.equals("yes") || isFromNIT.equals("no")) {
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }

        Student obj;

        if (isFromNIT.equals("no") || isFromNIT.equals("NO")) {
            System.out.println("Enter the college name:");
            String collegeName = sc.nextLine();
            obj = new Student(studentId, studentName, studentAddress, collegeName);
        } else {
            obj = new Student(studentId, studentName, studentAddress);
        }

        System.out.println("Student id:" + obj.getStudentId());
        System.out.println("Student name:" + obj.getStudentName());
        System.out.println("Address:" + obj.getStudentAddress());
        System.out.println("College name:" + obj.getCollegeName());

        sc.close();
    }
}