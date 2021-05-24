import java.util.ArrayList;

public class U7_L6_Activity_Two
{

  // Write your insertSort method as described in the assignment
  public static int insertSort(ArrayList<Integer> list) {
    int count = 0;
    for (int j = 1; j < list.size(); j++) {
      int temp = list.get(j);
      int possibleIndex = j;
      for (int k = possibleIndex; k>0; k--) {
        count++;
        if (temp < list.get(possibleIndex - 1)) {
          list.set(possibleIndex, list.get(possibleIndex - 1));
          possibleIndex--;
        } else {
          break;
        }
      }
      list.set(possibleIndex, temp);
    }
    return count;
  }
}
