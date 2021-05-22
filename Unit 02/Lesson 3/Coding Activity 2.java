/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String x;
    
    System.out.println("Enter a string:");
    x = scan.nextLine();
    int y = x.length();
    y --;
    System.out.print(x.substring(1,y));
  }
}
