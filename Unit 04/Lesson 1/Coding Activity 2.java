/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    double score = 0;
    double x = 1;
    double count = -1;
    
    System.out.println("Enter the Scores:");
    while (score > -1)
    {
      score = scan.nextInt();
      x += score;
      count++;
    }
    System.out.println("The average is: " + (x / count));
  }
}
