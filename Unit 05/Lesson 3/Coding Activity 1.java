/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U5_L3_Activity_One{

  /* Add the method makeSquare here */
  public static void makeSquare(Rectangle r) {
    double l = r.getLength();
    r.setWidth(l);
  }
  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    double length = scan.nextDouble();
    Rectangle s = new Rectangle(length);
    makeSquare(s, length);
  }
  */
}
