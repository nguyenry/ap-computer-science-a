import java.util.Scanner;

class Main {

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Type the message to be shortened");

    String msg = "";
    String newMsg = "";

    int vowelCount = 0;
    int consonantCount = 0;
    int totalCount, msgLength;

    msg = scan.nextLine();
    msgLength = msg.length();

    boolean isVowel = false;

    //ALGORITHM 1
    msg = msg.toLowerCase();

    for(int i = 0; i < msgLength; i++) {
      if(msg.charAt(i) == 'a') isVowel = true;
      if(msg.charAt(i) == 'e') isVowel = true;
      if(msg.charAt(i) == 'i') isVowel = true;
      if(msg.charAt(i) == 'o') isVowel = true;
      if(msg.charAt(i) == 'u') isVowel = true;

      if(!isVowel) {
        boolean isDoubleConsonant = ((i != 0 && (msg.charAt(i) == msg.charAt(i - 1)))) ? true : false;

        if(!isDoubleConsonant) newMsg += msg.charAt(i);
        if(isDoubleConsonant) consonantCount++;

        isDoubleConsonant = false;
      }

      if(isVowel) {
        boolean beginWord = (i != 0 && (msg.charAt(i - 1) == ' ') || (i == 0 && isVowel == true)) ? true : false;

        if(!isVowel || isVowel && beginWord == true) newMsg += msg.charAt(i);
        if(isVowel && !beginWord) vowelCount++;

        isVowel = false;
      }
    }

    totalCount = consonantCount + vowelCount;

    System.out.println("\nAlgorithm 1");
    System.out.println("Vowels removed: " + vowelCount);
    System.out.println("Repeats removed: " + consonantCount);
    System.out.println("Algorithm 1 message: " + newMsg);
    System.out.println("Algorithm 1 characters saved: " + totalCount);
  
    //ALGORITHM 2
    String letter = "";
    String shrt = "";
    String shrty = "";
    String shirt = "";
    int unique = 0;
    int uniqueCount = 0;
    boolean[] isItThere = new boolean[Character.MAX_VALUE];
    
    for (int k = 0; k < msgLength; k++) {
      if (msg.substring(k, k + 1).equals(" ")) {
        k++;
      }
      letter = msg.substring(k, k + 1);
      for (int h = 0; h < msgLength; h++) {
        if (msg.substring(h, h + 1).equals(letter)) {
          unique++;
          uniqueCount++;
        } else {
          
        }
      }
      shrt += unique + letter;
      unique = 0;
    }
    System.out.println("\nAlgorithm 2");
    System.out.println("Unique characters found: " + uniqueCount);
    System.out.println("Algorithm 2 message: " + shrt);
    System.out.println("Algorithm 2 characters saved: N/A");
  }
}
