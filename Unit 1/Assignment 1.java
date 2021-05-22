/* Assignment 1 - Movie Ratings */
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String movieName;
    int runningTime;
    int rating1;
    int rating2;
    int rating3;
    double decRating1;
    double decRating2;
    double avgRating;
    
    System.out.println("What is the title of the movie?");
    movieName = scan.nextLine();
    System.out.println("Please enter the running time in minutes.");
    runningTime = scan.nextInt();
    System.out.println("Please enter ratings from the movie review website.");
    rating1 = scan.nextInt();
    rating2 = scan.nextInt();
    rating3 = scan.nextInt();
    System.out.println("Please enter ratings from the focus group.");
    decRating1 = scan.nextDouble();
    decRating2 = scan.nextDouble();
    System.out.println("Please enter the average movie critic rating.");
    avgRating = scan.nextDouble();
    
    System.out.println("Title: " + movieName);
    int h = runningTime / 60;
    int m = runningTime % 60;
    System.out.println("Running time: " + h + "h" + m);
    double avgWebRating = (double) (rating1 + rating2 + rating3) / 3;
    System.out.println("Average website rating: " + avgWebRating);
    double avgFocusRating = (decRating1 + decRating2) / 2;
    System.out.println("Average focus group rating: " + avgFocusRating);
    System.out.println("Average movie critic rating: " + avgRating);
    double overallRating = ((avgWebRating * 0.2) + (avgFocusRating * 0.3) + (avgRating * 0.5)) / 1;
    int roundOverallRating = (int) (overallRating + 0.5);
    System.out.println("Overall movie rating: " + roundOverallRating);
  }
}
