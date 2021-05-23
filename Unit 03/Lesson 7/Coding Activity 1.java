/* Lesson 7 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L7_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter password:");
    String pw = "swordfish";
    String x = scan.nextLine();
    
    if (x.equals(pw)){
      System.out.println("Access granted!");
    } else {
      System.out.println("Access denied!");
    }
  }
}
