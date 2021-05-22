public class Coach extends Person {
  
  private String role;

/*
  Description: Coach() is a constructor for the Coach class and creates a Coach object with a first name, last name, and role
  Input parameters:
    String firstName, String lastName, String role
  Output:
    a Coach object is created
*/
  public Coach(String firstName, String lastName, String role) {
    super(firstName, lastName);
    this.role = role;
  }

/*
  Description: toString() is a String representation of the Coach object
  Input parameters:
    none
  Output:
    returns a String of a Coach's with his/her last name, first name, and role
*/
  public String toString() {
    return super.toString() + "\n   Role: " + this.role;
  }
}
