/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L3_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    for (int i = 23; i <= 89; i++) {
      if (i % 10 == 3) {
        System.out.println();
        System.out.print(i + " ");
      } else {
        System.out.print(i + " ");
      }
    }
  }
}
