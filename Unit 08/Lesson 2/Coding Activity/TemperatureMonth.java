public class TemperatureMonth{

  private double[][] temperatures;

  public TemperatureMonth(double[][] t){
    temperatures = t;
  }

  public double getMaxTemp(){
    double temp = temperatures[0][0]; //compare values to first element not 0
    
    for (int r = 0; r < temperatures.length; r++) {
      for (int c = 0; c < temperatures[0].length; c++) {
        if (temperatures[r][c] > temp) { //when temperature higher than temp
          temp = temperatures[r][c]; //will set equal
        }
      }
    }
    
    return temp;
  }

  public double getMinTemp(){
    double temp = temperatures[0][0];
    
    for (int r = 0; r < temperatures.length; r++) {
      for (int c = 0; c < temperatures[0].length; c++) {
        if (temperatures[r][c] < temp) { //when temperature lower than temp
          temp = temperatures[r][c]; //will set equal
        }
      }
    }
    
    return temp;
  }

  public double getMonthlyAverage(){
    double avg = 0;
    double sum = 0;
    double count = 0;
    
    for (int r = 0; r < temperatures.length; r++) {
      for (int c = 0; c < temperatures[0].length; c++) {
        sum += temperatures[r][c]; //adding up elements in 2D array
        count++; //finding the number of elements
      }
    }
    
    avg = sum / count; //dividing the sum by the # of elements to find the avg
    return avg;
  }

  public double[] getWeeklyAverages(){
    double[] avg = new double[temperatures.length];

    for (int r = 0; r < temperatures.length; r++) {
      double sum = 0; //declare here so sum returns to 0 after each row
      for (int c = 0; c < temperatures[0].length; c++) {
        sum += temperatures[r][c]; //adding up temp in one week
      }
      avg[r] = sum / temperatures[r].length; //divide to find avg and add to avg array at index r
    }
    
    return avg;
  }

}
