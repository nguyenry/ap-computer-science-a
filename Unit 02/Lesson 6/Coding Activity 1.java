/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_One{
  public static void main(String[] args){
  
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    int x;
    double y;
    
    System.out.println("Enter number of sides:");
    x = scan.nextInt();
    System.out.println("Enter a side length");
    y = scan.nextDouble();
    
    RegularPolygon r = new RegularPolygon(x,y);
    double p = r.getPerimeter();
    double a = r.getArea();
    System.out.println("A " + r + " has perimeter " + p + " and area " + a);
    
  }
}
