/*
  Name: Ryan Nguyen
  Date: 3/26/21
  Description: A subclass of the Coffee class that has the additional attribute flavor (String). The Coffee class has the attributes size (String), isSkinny(boolean), shots (int), and type (String).
*/

public class SpecialityCoffee extends Coffee
{
  private String flavor;
  
  /*
    Description:
      SpecialityCoffee() is the default constructor method that creates a small, non-skinny, single-shot latte with vanilla flavor.
    Input parameters:
      none
    Output:
      creates a SpecialityCoffee object that has attributes from the parent Coffee class
  */
  public SpecialityCoffee() {
    super(); //use the default constructor from the parent Coffee class
    flavor = "vanilla"; //set the flavor
  }

  /*
    Description:
      SpecialityCoffee() is a constructor method that creates a SpecialityCoffee object using 3 parameters.
    Input parameters:
      String size, String type, String f
    Output:
      creates a SpecialityCoffee object that has attributes from the parent Coffee class using 3 parameters
  */ 
  public SpecialityCoffee(String size, String type, String f) {
    this(size, false, 1, type, f); //use the default constructor of the SpecialityCoffee class
  }

  /*
    Description:
      SpecialityCoffee() is a constructor method that creates a SpecialityCoffee object using 5 parameters.
    Input parameters:
      String size, boolean isSkinny, int shots, String type, String f
    Output:
      creates a SpecialityCoffee object that has attributes from the parent Coffee class using  5parameters
  */ 
  public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String f) {
    super(size, isSkinny, shots, type); //call a constructor from the Coffee class
    flavor = f; //set the flavor
  }

  /*
    Description:
      toString() returns a String representation of the SpecialityCoffee object.
    Input parameters:
      none
    Output:
      returns a String that represents the object we created
  */ 
  public String toString() {
    return super.toString() /*call the toString() method from the Coffee class and combine with the flavor*/ + " with " + flavor;
  }
}
