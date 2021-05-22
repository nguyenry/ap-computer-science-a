/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U2_L3_Activity_Four{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String x;
    
    System.out.println("Enter a sentence:");
    x = scan.nextLine();
    int y = x.indexOf(" ");
    String z = x.substring(0,y);
    System.out.println(z.length());
  }
}
