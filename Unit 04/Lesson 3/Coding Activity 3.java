/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 100:");
    
    int input = scan.nextInt();
    int rem = input % 20;
    if (input > 0 && input < 100) {
      for (int i = input; i <= 100; i++) {
        if (i % 20 == rem) {
          System.out.println();
          System.out.print(i + " ");
        } else {
          System.out.print(i + " ");
        }
      }
    } else {
      System.out.println("error");
    }
  }
}
