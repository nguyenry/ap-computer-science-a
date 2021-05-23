import java.util.ArrayList;

public class U7_L5_Activity_Two
{

  // Write your selectSort method as described in the assignment
  public static void selectSort(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j) < list.get(minIndex)) {
          minIndex = j;
        }
      }
      int temp = list.get(i);
      list.set(i, list.get(minIndex));
      list.set(minIndex, temp);
    }
  }
}
