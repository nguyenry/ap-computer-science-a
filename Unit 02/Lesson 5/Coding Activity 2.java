/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_Two{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    double x;
    double y;
    double z;
    
    System.out.println("Type a radius:");
    x = scan.nextDouble();
    System.out.println("Type a length:");
    y = scan.nextDouble();
    System.out.println("Type a width:");
    z = scan.nextDouble();
    
    Circle c = new Circle(x);
    Rectangle r = new Rectangle(y,z);
    System.out.println(c);
    System.out.println(r);
  }
}
