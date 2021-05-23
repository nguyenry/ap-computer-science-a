/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L7_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter 2 strings:");
    String x = scan.nextLine();
    String y = scan.nextLine();
    
    int xLength = x.length() - 1;
    int yLength = y.length() - 1;
    String xStart = x.substring(0, xLength);
    String yStart = y.substring(0, yLength);
    String xLast = x.substring(x.length() - 1);
    String yLast = y.substring(y.length() - 1);
    
    if (x.equals(y)) {
      System.out.println("Great!");
    }
    else if ((xLength + 2) == (yLength + 2) && xStart.equals(yStart) && !(xLast.equals(yLast)))
    {
      System.out.println("Close enough");
    }
    else
    {
      System.out.println("Try again");
    }
  }
}
