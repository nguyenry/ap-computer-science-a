import java.util.ArrayList;

public class U7_L2_Activity_Three{

  public static ArrayList<Integer> getOdds(ArrayList<Integer> vals){
      // Implement this method as described in the assignment
      ArrayList<Integer> odd = new ArrayList<Integer>();
      for (int s : vals) {
        if (s % 2 != 0) {
          odd.add(s);
        }
      }
      return odd;
  }
}
