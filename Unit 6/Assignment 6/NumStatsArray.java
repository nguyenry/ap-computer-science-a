public class NumStatsArray {

  //Add a final private variable to hold double array
  private final double[] arr;
  
  public NumStatsArray(double[] a) {
    //Write constructor code
    arr = a;
  }

  //Implement all methods as described
  public String toString(){
    String str = "{";
    for (int i = 0; i < arr.length - 1; i++) {
      str += arr[i] + ", ";
    }
    str += arr[arr.length - 1] + "}";
    return str;
  }

  public double average() {
    double s = 0;
    for (double n : arr) {
      s += n;
    }
    s = s / arr.length;
    return s;
  }

  public double range() {
    
    double large = arr[0];
    double small = arr[0];
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > large) {
        large = arr[i]; //Will store new largest number and compare as we traverse the array
      }
    }
    
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] < small) {
        small = arr[j]; //Will store new smallest number and compare as we traverse the array
      }
    }
    return large - small;
  }

  public int sortStatus() {
    int status = 0;
    
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] <= arr[i + 1]) { //If the number is less than the next number, then it is increasing
      
        status = 1;
      } else {
        status = 0;
        break; //If there is any breakage, then the elements in the array are not increasing, so we break (can also use return statement)
      }
    }
    
    if (status != 1) { //No reason to use for-loop if array is increasing
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] >= arr[i + 1]) { //If the current number is greater than the next, then it's decreasing
          status = -1;
        } else {
          status = 0;
          break; //Any break of pattern = unsorted; we stop here
        }
      }
    }
    return status;
  }
}
