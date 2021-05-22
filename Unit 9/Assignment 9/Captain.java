public class Captain extends UltimatePlayer {

  private boolean type;
  private String role;

/*
  Description: Captain() is a constructor for the Captain class and creates a Captain object with a first name, last name, position, and type
  Input parameters:
    String firstName, String lastName, String position, boolean type
  Output:
    a Captain object is created
*/
  public Captain(String firstName, String lastName, String position, boolean type) {
    super(firstName, lastName, position);
    this.type = type;
    
    if (type) { //the type does not make it obvious what kind of captain he/she is, so when true, the captain is on offense, and when false, the captain is on defense
      role = "offense";
    } else {
      role = "defense";
    }
  }

/*
  Description: throwDisc() calculates the distance a frisbee is thrown by the person (distance = the power of the throw multiplied by 5)
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
    return pow * 5;
  }

/*
  Description: toString() is a String representation of the Captain object
  Input parameters:
    none
  Output: returns String of a Captain with his/her last name, first name, position, and type
*/
  public String toString() {
    return super.toString() + "\n   Captain: " + this.role;
  }
}
