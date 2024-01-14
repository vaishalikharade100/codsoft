/*
STUDENT GRADE CALCULATOR

Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user
*/

//#code
package code_soft;
import java.util.Scanner;
public class task2 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.println("Enter the marks of five subjects:\n");

       // To store the values of five subjects
       float sub_1 = in.nextFloat();
       float sub_2 = in.nextFloat();
       float sub_3 = in.nextFloat();
       float sub_4 = in.nextFloat();
       float sub_5 = in.nextFloat();

       float total;
       float average;
       float percentage;
       char grade;
       int sAvg;

       // Calculate total, average and percentage
       total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
       average = (float)(total / 5.0);
       percentage = (float)((total / 500.0) * 100);

       // It will divides average by 10 check switch expression
       sAvg = (int) average / 10;

       // It will calculate the Grade
       switch (sAvg) {
           case 10:
               grade = 'A';
               break;

           case 9:
               grade = 'A';
               break;

           case 8:
               grade = 'B';
               break;

           case 7:
               grade = 'C';
               break;

           case 6:
               grade = 'D';
               break;

           default:
               grade = 'E';
               break;
       }

       // It will produce the final output
       System.out.println("\nThe Total marks   = " + total + "/500.0");
       System.out.println("The Average marks = " + average);
       System.out.println("The Percentage    = " + percentage + "%");
       System.out.println("The Grade         = '" + grade + "'");
   }


}

/*OUTPUT-
Enter the marks of five subjects:


98
97
95
80
70

The Total marks   = 440.0/500.0
The Average marks = 88.0
The Percentage    = 88.0%
The Grade         = 'B'
*/
