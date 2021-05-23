/* Lesson 2 Coding Activity Question 3 */
import java.util.Scanner;

public class U4_L2_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    int confirm = 0;
    double lon = 0;
    double lat = 0;
    double maxLon = -180;
    double minLon = 180;
    double maxLat = -90;
    double minLat = 90;
    
    System.out.println("Please enter the longitude:");
    lon = scan.nextDouble();
    System.out.println("Please enter the latitude:");
    lat = scan.nextDouble();
    System.out.println("Would you like to enter another location (1 for yes, 0 for no)?");
    if (lon > maxLon){
      maxLon = lon;
    }
    if (lon < minLon) {
      minLon = lon;
    }
    if (lat > maxLat) {
      maxLat = lat;
    }
    if (lat < minLat) {
      minLat = lat;
    }
    confirm = scan.nextInt();
    
    while (confirm == 1) {
      System.out.println("Please enter the longitude:");
      lon = scan.nextDouble();
      System.out.println("Please enter the latitude:");
      lat = scan.nextDouble();
      
      if ((lon < -180 || lon > 180) || (lat < -90 || lat > 90)) {
        System.out.println("Incorrect Latitude or Longitude");
      }
      else {
        if (lon > maxLon) {
          maxLon = lon;
        }
        if (lon < minLon) {
          minLon = lon;
        }
        if (lat > maxLat) {
          maxLat = lat;
        }
        if (lat < minLat) {
          minLat = lat;
        }
      }
      
      System.out.println("Would you like to enter another location (1 for yes, 0 for no)?");
      confirm = scan.nextInt();
    }
    
    System.out.println("Farthest North: " + maxLat);
    System.out.println("Farthest South: " + minLat);
    System.out.println("Farthest East: " + maxLon);
    System.out.println("Farthest West: " + minLon);
  }
}
