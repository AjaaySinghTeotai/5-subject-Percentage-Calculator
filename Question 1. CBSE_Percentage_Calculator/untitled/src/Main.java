/**
*Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
*/

/**
 * CBSE_Percentage_Calculator
 */
import java.main.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in)

        System.out.println("Enter Marks Of The Subject 1");
        float marks1 = sc.nextFloat();
        System.out.println("Enter Total Marks Of The  Subject 1");
        int total_marks1 = sc.nextInt();

        System.out.println("Enter Marks Of The Subject 2");
        float marks2 = sc.nextFloat();
        System.out.println("Enter Total Marks Of The Subject 2");
        int total_marks2 = sc.nextInt();

        System.out.println("Enter Marks Of The Subject 3");
        float marks3 = sc.nextFloat();
        System.out.println("Enter Total Marks Of The Subject 3");
        int total_marks3 = sc.nextInt();

        System.out.println("Enter Marks Of The Subject 4");
        float marks4 = sc.nextFloat();
        System.out.println("Enter Total Marks Of The Subject 4");
        int total_marks4 = sc.nextInt();

        System.out.println("Enter Marks Of The Subject 5");
        float marks5 = sc.nextFloat();
        System.out.println("Enter Total Marks Of The Subject 5");
        int total_marks5 = sc.nextInt();

        float sum = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.print("Total Sum ");
        System.out.println(sum);

        int total_sum = total_marks1 + total_marks2 + total_marks3 + total_marks4 + total_marks5;
        System.out.print("Total Marks Sum ");
        System.out.println(total_sum);

        double percentage = (sum/total_sum)*100;
        System.out.println("Percentage ");
        System.out.print(percentage);
    }
}