/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String x;
    
    System.out.println("Enter a string:");
    x = scan.nextLine();
    System.out.print(x.substring(0,1));
    int y = x.length();
    y --;
    System.out.println(x.substring(y));
    
  }
}
