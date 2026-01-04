package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;


import java.util.Scanner;

// 3. Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
public class Question3 {

    static char isGrade(int marks) {

        if(marks > 90 )
            return 'A';
        else if (marks > 80) {
            return 'B';
        } else if (marks > 70) {
            return 'C';
        } else if (marks > 60) {
            return 'D';
        } else
            return 'F';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if(marks <= 100)
            System.out.print("Grade: "+ isGrade(marks));
        else
            System.out.print("Enter your valid marks");

    }
}
