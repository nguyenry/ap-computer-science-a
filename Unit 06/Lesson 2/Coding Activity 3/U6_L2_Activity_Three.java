public class U6_L2_Activity_Three{

  // Write your hasDuplicates method here
  public static boolean hasDuplicates(int[] arr1) {
    
    boolean dup = false;
    
    for (int i = 0; i < arr1.length; i++) {
      //will check if values from j to i are equal
      for (int j = i + 1; j < arr1.length; j++) {
        if (arr1[j] == arr1[i]) {
          dup = true;
          break;
        }
      }
    }
    return dup;
  }
}
