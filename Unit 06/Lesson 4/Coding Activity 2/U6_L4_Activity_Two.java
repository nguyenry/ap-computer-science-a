public class U6_L4_Activity_Two{

  // Write the methods swap and allSwap here
  public static void swap(int[] arr, int i, int j) {
    if (i < arr.length && j < arr.length) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
  
  public static void allSwap(int[] arr){
    if (arr.length % 2 == 0) {
      for(int i = 0; i < arr.length; i = i + 2) {
        int x = arr[i] + arr[i + 1];
        arr[i] = x - arr[i];
        arr[i + 1] = x - arr[i + 1];
      }
    }
  }
}
