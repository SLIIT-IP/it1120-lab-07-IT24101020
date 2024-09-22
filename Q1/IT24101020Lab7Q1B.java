import java.util.Scanner;

public class IT24101020Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        for (int student = 1; student <= 3; student++) {
            System.out.println("Enter marks for 4 subjects (separated by space) for Student " + student + ": ");
            
            
            int subject1 = scanner.nextInt();
            int subject2 = scanner.nextInt();
            int subject3 = scanner.nextInt();
            int subject4 = scanner.nextInt();

            
            double average = (subject1 + subject2 + subject3 + subject4) / 4.0;

            
            System.out.println("Student " + student + " - Average Marks: " + average);

            
            if (average >= 75 && average <= 100) {
                System.out.println("Student " + student + " - Grade: Distinction");
            } else if (average >= 50 && average < 75) {
                System.out.println("Student " + student + " - Grade: Credit");
            } else if (average >= 0 && average < 50) {
                System.out.println("Student " + student + " - Grade: Fail");
            } else {
                System.out.println("Invalid marks entered for Student " + student + "!");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
