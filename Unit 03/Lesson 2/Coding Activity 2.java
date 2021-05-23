/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L2_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter two numbers:");
    double x = scan.nextDouble();
    double y = scan.nextDouble();
    if (x > y)
    {
      System.out.println("Largest is: " + x);
    }
    if (y > x)
    {
      System.out.println("Largest is: " + y);
    }
    if (x == y)
    {
      System.out.println("Largest is: " + x);
    }
  }
}
