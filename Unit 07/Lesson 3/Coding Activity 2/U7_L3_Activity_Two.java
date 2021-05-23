import java.util.ArrayList;

public class U7_L3_Activity_Two
{
  // Write the printStatistics method as described in the assignment

  public static void printStatistics(ArrayList<Integer> nums){
    int sum = 0;
    int mode = nums.get(0);
    boolean hasMode = false;
    int maxCount = 0;

    for(int i = 0; i < nums.size(); i++) {
      sum += nums.get(i);
      int count = 1;
      
      for(int j = i + 1; j < nums.size(); j++) {
        if(nums.get(i).equals(nums.get(j))) {
          count++;
        }
      }

      if(count > maxCount){
        mode = nums.get(i);
        hasMode = true;
        maxCount = count;
      } else if(count == maxCount) {
        hasMode = false;
      }
    }

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + (double) sum/nums.size());
    System.out.print("Mode: ");

    if(hasMode){
      System.out.println(mode);
    } else {
      System.out.println("no single mode");
    }
  }
}
