/*
  Name: Ryan Nguyen
  Date: 03/18/21
  Description: represents a game of Battleship that is played on a square 10x10 grid by using a 2-D array
*/
public class Board{

  private String[][] squares;

  /*
   Description:
    Board() is a constructor that initilizes the squares array to be blank ("-")
   Input parameters:
    none
   Output:
    creates a "blank board" to play Battleship
  */
  public Board(){
    squares = new String[10][10];
    
    for (int r = 0; r < squares.length; r++) {
      for (int c = 0; c < squares[r].length; c++) {
        squares[r][c] = "-"; //assign each element to be empty aka "-"
      }
    }
  }

  /*
   Description:
    toString() represents the game of Battleship using a String
   Input parameters:
    none
   Output:
    returns a String representation of the Board() object aka the game
  */
  public String toString(){
    String game = "";
    
    for (int r = 0; r < squares.length; r++) {
      for (int c = 0; c < squares[r].length; c++) {
        game += squares[r][c] + " "; //add values of each element into String
      }
      game += "\n"; //after one row, new line added
    }
    return game;
  }

  /*
   Description:
    addShip() adds a ship to the board of length len, at the row & column specified, and either proceeding horizontally or vertically
   Input parameters:
    int row, int col, int len, boolean horizontal
   Output:
    returns true if the ship is placed and returns false if the ship cannot be placed
  */
  public boolean addShip(int row, int col, int len, boolean horizontal){
    
    //if the bounds of the ship is off the grid, then return false
    if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length) {
      return false;
    }
    
    if (horizontal == true) { //checks a horizontal ship
      if (col + len > squares.length) { //false when the ship is off grid
        return false;
      }
      
      for (int c = col; c < col + len; c++) {
        if (!squares[row][c].equals("-")) { //checks to see if another ship is in the way
          return false;
        }
      }
      
      for (int c = col; c < col + len; c++) {
        squares[row][c] = "b"; //if false is not returned, we can add in all the "b"s
      }
    } else { //checks a vertical ship
      if (row + len > squares.length) { //false when the ship is off grid
        return false;
      }
      
      for (int r = row; r < row + len; r++) { //have to travel down the rows instead of across to check a vertical ship
        if (!squares[r][col].equals("-")) { //if a something is in the way, then we return false because a ship cannot be placed
          return false;
        }
      }
      
      for (int r = row; r < row + len; r++) {
        squares[r][col] = "b"; //can add a ship if everything passes
      }
    }
    return true; //default true since method will stop if anything is false
  }

  /*
   Description:
    foundShip() searches the grid for ships of length len
   Input parameters:
    int len
   Output:
    returns true if there are len consecutive squares of "b" and returns false otherwise
  */
  public boolean foundShip(int len){
    for (int r = 0; r < squares.length; r++) { //horizontal ships
      int count = 0;
      
      while (count < squares[r].length) {
        int hitLen = 0;
        
        while (count < squares[r].length && squares[r][count].equals("b")) {
          hitLen++; //when we encounter a ship, we add up its length
          count++; //counter to end while loop at end of row
        }
        if (hitLen == len) { //if its length is equal to len, then we return true because we found a ship of length len
          return true;
        }
        count++; //counter to end while loop at end of row
      }
    }
    
    for (int c = 0; c < squares[0].length; c++) { //vertical ships
      int count = 0;
      
      while (count < squares.length) { //traversing down the rows forming a column = vertical ship
        int hitLen = 0;
        
        while (count < squares.length && squares[count][c].equals("b")) {
          hitLen++; //when we encounter a ship, we add up its length
          count++; //counter to end while loop at end
        }
        if (hitLen == len) { //if its length is equal to len, then we return true because we found a ship of length len
          return true;
        }
        count++; //counter to end while loop at end
      }
    }
    return false;
  }

  /*
   Description:
    foundShip() represents a shot taken at the board that can miss (changes "-" to "m") or hit (changes "b" to "x")
   Input parameters:
    int row, int col
   Output:
    returns -1 if hit out of bounds, returns 0 if miss, returns 1 if hit, returns 2 if already hit ("x" or "m")
  */
  public int shoot(int row, int col){
    
    //returns -1 if the "shot" is out of bounds
    if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length) {
      return -1;
    }
    
    //returns 0 if the "shot" hits an empty space/no ship aka "-"
    if (squares[row][col].equals("-")) {
      squares[row][col] = "m";
      return 0;
    }
    
    //returns 1 if the "shot" hits a ship aka "b"
    if (squares[row][col].equals("b")) {
      squares[row][col] = "x";
      return 1;
    }
    
    return 2; //this means that the shot target was either a "m" or "x," meaning we return 2
  }

  /*
   Description:
    gameOver() ends the game when there are no more unsunk ships
   Input parameters:
    none
   Output:
    returns true when the game is over and returns false if not
  */
  public boolean gameOver(){
    boolean status = false;
    
    for (int r = 0; r < squares.length; r++) {
      for (int c = 0; c < squares[r].length; c++) {
        if (!squares[r][c].equals("b")) {
          status = true; //game is over when there are no ships aka "b"
        } else { 
          return false; //game is not over yet because there are still ships
        }
      }
    }
    return status;
  }

}
