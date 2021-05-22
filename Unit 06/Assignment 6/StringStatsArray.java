public class StringStatsArray {

  //Add a final private variable to hold String array
  private final String[] str;

  public StringStatsArray(String[] a) {
    //Write constructor code
    str = a;
  }

  //Implement all methods as described
  public String toString(){
    String s = "{";
    
    for (int i = 0; i < str.length - 1; i++) {
      s += "\"" + str[i] + "\", ";
    }
    s += "\"" + str[str.length - 1] + "\"}";
    return s;
  }

  public double averageLength() {
    double s = 0;
    
    for (String n : str) {
      s += n.length();
    }
    s = s / str.length;
    return s;
  }

  public int search(String target) {
    int s = -1;
    
    for (int i = 0; i < str.length; i++) {
      if (target.equals(str[i])) {
        s = i;
        break;
      }
    }
    return s;
  }

  public int sortStatus() {
    int status = 0;
    
    //Have to use nested for-loop to traverse the array AND the string
    for (int i = 0; i < str.length; i++) {
      for (int j = i + 1; j < str.length; j++) {
        //compareTo() returns space between 2 letters in alphabetical order (ex: 14 spaces btw "a" & "0")
        if (str[i].compareTo(str[j]) <= 0) { //Preceding in alphabet = -#
          status = 1;
        } else {
          status = 0;
          break; //Can use return statement
        }
      }
      //Because using nested loop, have to break the outer loop too when elements in array are unsorted
      if (status == 0) {
        break;
      }
    }
    
    if (status != 1) {
      for (int i = 0; i < str.length; i++) {
        for (int j = i + 1; j < str.length; j++) {
          if (str[i].compareTo(str[j]) >= 0) { //Proceeding in alphabet = +#
            status = -1;
          } else {
            status = 0;
            break;
          }
        }
        if (status == 0) {
          break;
        }
      }
    }
    return status;
  }
}
