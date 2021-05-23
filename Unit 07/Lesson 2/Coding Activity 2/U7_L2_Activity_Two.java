import java.util.ArrayList;

public class U7_L2_Activity_Two{

  // write your average method here
  public static double average (ArrayList<Double> list) {
    double sum = 0;
    
    for (double s : list) {
      sum += s;
    }
    
    return (sum / list.size());
  }
}
