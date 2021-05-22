public class UltimatePlayer extends Person {
  
  private int jerseyNumber;
  private String position;
  private static int jerseyCount = 0;

/*
  Description: UltimatePlayer() is a constructor for the UltimatePlayer class and creates an UltimatePlayer object with a first name, last name, and position
  Input parameters:
    String firstName, String lastName, String position
  Output:
    an UltimatePlayer object is created
*/
  public UltimatePlayer(String firstName, String lastName, String position) {
    super(firstName, lastName);
    if (position.equals("handler") || position.equals("cutter")) {
      this.position = position;
    } else {
      this.position = "handler";
    }
    this.jerseyCount++;
    this.jerseyNumber = jerseyCount;
  }

/*
  Description: getPosition() finds the position of an UltimatePlayer object
  Input parameters:
    none
  Output:
    returns a String indicating the position of an ultimate frisbee player
*/ 
  public String getPosition() {
    return position;
  }

/*
  Description: throwDisc() calculates the distance a frisbee is thrown by the person (distance = the power of the throw multiplied by 4)
  Input parameters:
    int pow
  Output:
    returns an int representing the distance thrown in yards
*/
  public int throwDisc(int pow) {
    if (pow > 10) {
      pow = 10; //if greater than 10, we just set to 10
    } else if (pow < 1) {
      pow = 1; //if less than 1, we just set to 1
    }
    return pow * 4;
  }

/*
  Description: toString() is a String representation of the UltimatePlayer object
  Input parameters:
    none
  Output: returns a String of an UltimatePlayer with his/her last name, first name, and position
*/
  public String toString() {
    return super.toString() + "\n   Jersey #: " + this.jerseyNumber + "\n   Position: " + this.position;
  }
}
