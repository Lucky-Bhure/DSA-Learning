package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;


import java.util.Scanner;

// 2. Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both.
public class Question2 {

    static void display(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("FizzBuzz");
        } else if(num % 3 == 0) {
            System.out.print("Fizz");
        } else if (num % 5 == 0) {
            System.out.print("Buzz");
        } else
            System.out.print("Not divisible by 3 nor 5");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        display(num);
    }
}
