public class U6_L2_Activity_Two{

  // Write your numEven method here
  public static int numEven (int[] arr1) {
    
    int count = 0;
    
    for (int i = 0; i < arr1.length; i++) {
      //checks if even
      if (arr1[i] % 2 == 0) {
        count++;
      }
    }
    return count;
  }
}
