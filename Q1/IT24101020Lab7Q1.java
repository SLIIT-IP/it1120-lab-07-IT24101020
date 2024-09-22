import java.util.Scanner;

public class IT24101020Lab7Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int subject1, subject2, subject3, subject4;
        double average;

        
        System.out.print("Enter marks for subject 1: ");
        subject1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        subject2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        subject3 = scanner.nextInt();

        System.out.print("Enter marks for subject 4: ");
        subject4 = scanner.nextInt();

        
        average = (subject1 + subject2 + subject3 + subject4) / 4.0;

        
        System.out.println("Average Marks: " + average);

       
        if (average >= 75 && average <= 100) {
            System.out.println("Grade: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Grade: Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered!");
        }

        scanner.close();
    }
}
