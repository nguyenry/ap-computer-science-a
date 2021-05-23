/*Lesson 6 Coding Activity*/
import java.util.Scanner;

public class Vehicle {
  
  private String vehicle = "";
  private int location;
  
  public Vehicle () {
    location = 0;
  }
  
  public Vehicle (int loc) {
    if (loc >= -20 && loc <= 20) {
      location = loc;
    } else {
      location = 0;
    }
  }
  
  public void forward () {
    if (location + 1 <= 20) {
      location += 1;
    }
  }
  
  public void backward () {
    if (location - 1 >= -20) {
      location -= 1;
    }
  }
  
  public int getLocation () {
    return location;
  }
  
  public String toString () {
    if (vehicle.equals("")) {
      for (int i = -20; i < location; i++) {
        vehicle += " ";
      }
    } else {
      vehicle = "";
      for (int i = -20; i < location; i++) {
        vehicle += " ";
      }
    }
    return vehicle + "@";
  }
}
