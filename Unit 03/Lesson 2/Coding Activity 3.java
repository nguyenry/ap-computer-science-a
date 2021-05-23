/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L2_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a test score:");
    double x = scan.nextDouble();
    if (x > 100)
    {
      System.out.println("Not Valid");
    }
    if (x < 0)
    {
      System.out.println("Not Valid");
    }
  }
}
