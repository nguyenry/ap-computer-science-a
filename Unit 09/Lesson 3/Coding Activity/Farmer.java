public class Farmer {

  private String forename;
  private String surname;

/*
  Description: Farmer() is a constructor of the Farm class that creates an object representing a farmer with a first name and last name
  Input parameters:
    String f, String s
  Output:
    creates a Farmer object
*/
  public Farmer(String f, String s) {
    forename = f;
    surname = s;
  }

/*
  Description: toString() creates a String representation of the Farmer object
  Input parameters:
    none
  Output:
    returns a String()
*/
  public String toString(){
    return forename + " " + surname;
  }

}
