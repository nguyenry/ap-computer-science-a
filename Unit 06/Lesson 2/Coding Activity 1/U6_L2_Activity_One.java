public class U6_L2_Activity_One{

  // Write your allNegative method here
  public static boolean allNegative (double[] arr1) {
    
    boolean neg = true;
    
    for (int i = 0; i < arr1.length; i++) {
      //if positive
      if (arr1[i] >= 0) {
        //return false
        neg = false;
        break;
      }
    }
    //if negative return true
    return neg;
  }
}
