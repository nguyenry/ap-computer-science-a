import java.util.ArrayList;

public class U7_L4_Activity_One{
  public static int countInitial(ArrayList<String> list, String letter){

    // Implement the countInitial method as described in the assignment
    int count = 0;
    String let = letter.toLowerCase();
    
    for (int i = 0; i < list.size(); i++) {
      String first = list.get(i).substring(0, 1);
      first = first.toLowerCase();
      if (first.equals(let)) {
        count++;
      }
    }
    return count;
  }
}
