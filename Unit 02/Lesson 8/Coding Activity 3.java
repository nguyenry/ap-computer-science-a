/* Lesson 8 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L8_Activity_Three{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter two integers:");
    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = x - y;
    int a = (int) Math.abs(z);
    System.out.println("Difference: " + a);
  }
}
