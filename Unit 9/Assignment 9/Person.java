/*
  Name: Ryan Nguyen
  Date: 04/19/21
  Description: A program that represents a team playing Ultimate Frisbee through the use of a hierarchy of five classes
*/
public class Person {
  
  private String firstName;
  private String lastName;

/*
  Description: Person() is a constructor for the Person class and creates a Person object with a first name and last name
  Input parameters:
    String firstName, String lastName
  Output:
    a Person object is created
*/
  public Person(String firstName, String lastName) {
    this.firstName = firstName; //need to use "this" function to erase confusion between variables and parameters
    this.lastName = lastName;
  }

/*
  Description: throwDisc() calculates the distance a frisbee is thrown by the person (distance = the power of the throw multiplied by 2)
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
    return pow * 2;
  }

/*
  Description: toString() is a String representation of the Person object
  Input parameters:
    none
  Output:
    returns a String of a Person's "lastName, firstName"
*/
  public String toString() {
    return lastName + ", " + firstName;
  }
}
