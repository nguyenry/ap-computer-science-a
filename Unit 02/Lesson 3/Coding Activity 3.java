/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String x;
    String y;
    
    System.out.println("Enter first word:");
    x = scan.nextLine();
    System.out.println("Enter second word:");
    y = scan.nextLine();
    
    String a = x.toLowerCase();
    String b = y.toLowerCase();
    System.out.println(a.compareTo(b));
  }
}
