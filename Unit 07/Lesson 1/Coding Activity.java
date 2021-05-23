import java.util.Scanner;
import java.util.ArrayList;

public class U7_L1_Activity_One{

  public static void main(String[] args){
    /* write your code here */
    Scanner scan = new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<String>();
    String x = "";
    
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!(x.equals("STOP"))) {
      x = scan.nextLine();
      if (x.equals("STOP")) {
        break;
      }
      arr.add(x);
    }
    System.out.println(arr.size());
    System.out.println(arr);
    
    if (arr.size() > 2) {
      arr.remove(0);
      arr.remove(arr.size() - 1);
    }
    System.out.println(arr);
  }
}
