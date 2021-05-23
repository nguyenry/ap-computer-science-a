/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.testing.Math;

public class U3_L3_Activity_Three{
  public static void main(String[] args){

    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    int x = (int) (12 * Math.random() + 1);
    int y = (int) (12 * Math.random() + 1);
    System.out.println(x + " * " + y + " = ?");
    int z = scan.nextInt();
    if (z == x * y)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Wrong");
    }
  }
}
