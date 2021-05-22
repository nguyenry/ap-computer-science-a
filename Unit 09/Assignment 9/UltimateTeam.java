// Don't forget, you will need to import the ArrayList class to implement the UltimateTeam class
import java.util.ArrayList;

public class UltimateTeam {
  
  private ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
  private ArrayList<Coach> coaches = new ArrayList<Coach>();

/*
  Description: UltimateTeam() is a constructor for the UltimateTeam class and creates an UltimateTeam object, which is includes a list of the players and coaches on the team
  Input parameters:
    ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches
  Output:
    an UltimateTeam object is created
*/ 
  public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
    this.players = players;
    this.coaches = coaches;
  }

/*
  Description: getCutters() finds players whose positions are cutters
  Input parameters:
    none
  Output:
    returns a String that includes all the players that are cutters
*/   
  public String getCutters() {
    String cutters = "";
    
    for (int i = 0; i < players.size(); i++) { //traverse the players list
      UltimatePlayer player = this.players.get(i); //create an instance of a player at index i
      String position = player.getPosition(); //find the position of that player
      
      if (position.equals("cutter")) { //if that position is a cutter
        cutters += player.toString() + "\n"; //then we add that to our String
      }
    }
    return cutters;
  }

/*
  Description: getHandlers() finds players whose positions are handlers
  Input parameters:
    none
  Output:
    returns a String that includes all the players that are handlers
*/ 
  public String getHandlers() {
    String handlers = "";
    
    for (int i = 0; i < players.size(); i++) { //traverse the players list
      UltimatePlayer player = this.players.get(i); //create an instance of a player at index i
      String position = player.getPosition(); //find the position of that player
      
      if (position.equals("handler")) { //if that position is a handler
        handlers += player.toString() + "\n"; //then we add that to our String
      }
    }
    return handlers;
  }

/*
  Description: toString() is a String representation of the UltimateTeam object
  Input parameters:
    none
  Output: returns a String of an UltimateTeam that includes a list of the coaches and players
*/ 
  public String toString() {
    String str = "COACHES\n";
    
    for (int i = 0; i < this.coaches.size(); i++) { //traverse coaches list
      str += this.coaches.get(i).toString() + "\n"; //add the coaches to our String
    }
    str += "\nPLAYERS\n";
    for (int i = 0; i < this.players.size(); i++) { //traverse players list
      str += this.players.get(i).toString() + "\n"; //add the players to our String
    }
    return str;
  }
}
