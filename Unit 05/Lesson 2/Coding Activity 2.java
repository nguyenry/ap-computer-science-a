/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U5_L2_Activity_Two{

  /* Add the method reverser here */
  public static void reverser(String str) {
    for (int i = str.length(); i > 0; i--) {
      System.out.print(str.substring(i - 1, i));
    }
  }
  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    reverser("monitor");
  }
  */
}
