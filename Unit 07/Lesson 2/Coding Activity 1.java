import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One{

  public static void main(String[] args){
    /* write your code here */
    Scanner scan = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
    String x = "";
    
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!(x.equals("STOP"))) {
      x = scan.nextLine();
      if (x.equals("STOP")) {
        break;
      }
      list.add(x);
    }
    
    System.out.println(list);
    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.println(list.get(i));
    }
  }
}
