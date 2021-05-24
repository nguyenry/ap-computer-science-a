public class DoubleCone extends Cone
{
  private String flavor2 = "";
  
  /*
    Description: DoubleCone() is the default constructor of the DoubleCone class that overrides the constructor in the Cone class. It sets the second flavor of ice-cream.
    Input parameters:
      String f, boolean w
    Output:
      creates a DoubleCone object with the same flavor for 2 ice-creams
  */
  public DoubleCone(String f, boolean w) {
    super(f, w); //calls the Cone class
    flavor2 = f;
  }
  
  /*
    Description: DoubleCone() is a constructor of the DoubleCone class that overrides the constructor in the Cone class. It sets the second flavor of ice-cream.
    Input parameters:
      String f1, String f2, boolean w
    Output:
      creates a DoubleCone object that can have 2 different flavors
  */
  public DoubleCone(String f1, String f2, boolean w) {
    super(f1, w);
    flavor2 = f2; //new flavor for second cone
  }
  
  /*
    Description: setFlavor() sets the flavors of the DoubleCone object to the same flavor
    Input parameters:
      String f
    Output:
      DoubleCone object now has a new flavor that is the same for both ice-creams
  */
  public void setFlavor(String f) {
    super.setFlavor(f); //calls the setFlavor() method from the Cone class
    flavor2 = f;
  }
  
  /*
    Description: setFlavor() sets the flavors of the DoubleCone object to the same flavor
    Input parameters:
      String f1, String f2
    Output:
      DoubleCone object now has 2 new flavors that is can be different for both ice-creams
  */
  public void setFlavor(String f1, String f2) {
    super.setFlavor(f1);
    flavor2 = f2; //new flavor for second cone
  }
  
  /*
  Description: toString() returns a String representation of the DoubleCone object
  Input parameters:
    none
  Output:
    returns a String that overrides the toString() method in the Cone class that represents the DoubleCone object
  */
  public String toString() {
    return "double " + super.toString() /*calls toString() method from Cone class*/ + " and " + flavor2;
  }
}
