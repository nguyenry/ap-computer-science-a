/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L2_Activity_Four{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is the temperature?");
    double x = scan.nextDouble();
    if (x < 99)
    {
      System.out.println("WARNING");
    }
    if (x > 102)
    {
      System.out.println("WARNING");
    }
  }
}
