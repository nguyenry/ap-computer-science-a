/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L2_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    double x = scan.nextDouble();
    double y = scan.nextDouble();
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    
    if ((x + y + a + b) / 4 >= 89.5)
    {
      System.out.println("ABOVE AVERAGE");
    }
  }
}
