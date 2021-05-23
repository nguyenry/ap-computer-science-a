/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U5_L4_Activity_Three{

  /* Add the method areaDiff here */
  public static double areaDiff(Rectangle r1, Rectangle r2) {
    double diff = Math.abs(r1.getArea() - r2.getArea());
    return diff;
  }
  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    
  }
  */
}
