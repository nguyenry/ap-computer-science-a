/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four{

  /* Add the method realTime here */
  public static void realTime(int sec) {
    System.out.println("Hours: " + (sec / 60 / 60));
    System.out.println("Minutes: " + (sec / 60 % 60));
    System.out.println("Seconds: " + (sec % 60));
  }
  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    realTime(6342);
  }
  */
}
