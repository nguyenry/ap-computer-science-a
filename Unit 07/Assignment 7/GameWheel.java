import java.util.ArrayList;

public class GameWheel
{
  private ArrayList<Slice> slices; // List of slices making up the wheel
  private int currentPos;   // Position of currently selected slice on wheel


  /* Returns string representation of GameWheel with each numbered slice
   * on a new line
   */
  public String toString(){
    //Implement the toString method here
    String slice = "";
    
    for (int i = 0; i < slices.size(); i++) {
      //uses toString() from Slice.java but for element at i
      slice += i + " - " + slices.get(i).toString() + "\n";
    }
    return slice;
  }


  /* Randomizes the positions of the slices that are in the wheel, but without
   * changing the pattern of the colors
   */
  public void scramble()
  {
    //create new lists for different colors
    ArrayList<Slice> blacks = new ArrayList<Slice>();
    ArrayList<Slice> reds = new ArrayList<Slice>();
    ArrayList<Slice> blues = new ArrayList<Slice>();
    
    //add elements into color-sorted lists
    for (int i = 0; i < slices.size(); i++) {
      if (i % 5 == 0) {
        blacks.add(slices.get(i));
      } else if (i % 2 == 0 && i >= 2) {
        blues.add(slices.get(i));
      } else {
        reds.add(slices.get(i));
      }
    }
    //clear slices, so we can add the elements back in
    slices.clear();
    
    //randomize the elements and add them back into slices
    for (int i = 0; i < 20; i++) {
      if (i % 5 == 0) {
        slices.add(blacks.remove((int)(Math.random() * blacks.size())));
      } else if (i % 2 == 0) {
        slices.add(blues.remove((int)(Math.random() * blues.size())));
      } else {
        slices.add(reds.remove((int)(Math.random() * reds.size())));
      }
    }
  }

  /* Helper Method */
  public static void insertSort(ArrayList<Slice> list) {
    for (int i = 1; i < list.size(); i++) {
      int temp = list.get(i).getPrizeAmount();
      int j;
      for (j = i; j > 0; j--) {
        if (temp >= list.get(j - 1).getPrizeAmount()) {
          break;
        }
        list.add(j - 1, list.remove(j));
      }
    }
  }

  /* Sorts the positions of the slices that are in the wheel by prize amount,
   * but without changing the pattern of the colors.
   */
  public void sort(){
    //create new lists for different colors
    ArrayList<Slice> blacks = new ArrayList<Slice>();
    ArrayList<Slice> reds = new ArrayList<Slice>();
    ArrayList<Slice> blues = new ArrayList<Slice>();
    
    //add elements into color-sorted lists
    for (int i = 0; i < slices.size(); i++) {
      if (i % 5 == 0) {
        blacks.add(slices.get(i));
      } else if (i % 2 == 0 && i >= 2) {
        blues.add(slices.get(i));
      } else {
        reds.add(slices.get(i));
      }
    }
    slices.clear();
    
    //use helper method to sort each color in increasing order
    insertSort(blacks);
    insertSort(reds);
    insertSort(blues);
    
    //add color-sorted elements back into slices
    for (int i = 0; i < 20; i++) {
      if (i % 5 == 0) {
        slices.add(blacks.remove(0));
      } else if (i % 2 == 0 && i >= 2) {
        slices.add(blues.remove(0));
      } else {
        slices.add(reds.remove(0));
      }
    }
  }

  /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */

  /* Creates a wheel with 20 preset slices
   */
  public GameWheel()
  {
    this(getStandardPrizes());
  }

  /* Creates a wheel with 20 slices, using values from array parameter
   */
  public GameWheel(int[] prizes)
  {
    currentPos = 0;
    slices = new ArrayList<Slice>();
    for (int i = 0; i < 20; i++) {
      int pa = 0;
      String col = "blue";
      if (i < prizes.length)
        pa = prizes[i];
      if (i % 5 == 0)
        col = "black";
      else if (i % 2 == 1)
        col = "red";
      slices.add(new Slice(col, pa));
    }
  }

  /* Spins the wheel by so that a different slice is selected. Returns that
   * slice (Note: the 10 slices following the current slice are more likely to
   * be returned than the other 10).
   */
  public Slice spinWheel()
  {
    //spin power between range of 1-50 (inclusive)
    int power = (int)(Math.random() * 50 + 1);
    int newPos = (currentPos + power) % slices.size();
    currentPos = newPos;
    return slices.get(currentPos);
  }

  public Slice getSlice(int i){
    int sliceNum = i;
    if(i < 0 || i > 19)
      sliceNum = 0;
    return slices.get(sliceNum);
  }

  // Makes an array with a standard list of prizes
  private static int[] getStandardPrizes()
  {
    int[] arr = new int[20];
    for (int i = 0; i < 20; i++)
    {
      if (i % 5 == 0)
        arr[i] = i * 1000;
      else if (i % 2 == 1)
        arr[i] = i * 100;
      else
        arr[i] = i * 200;
    }
    return arr;
  }
}
