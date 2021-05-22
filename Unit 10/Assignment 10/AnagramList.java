/*
  Name: Ryan Nguyen
  Date: 05/03/21
  Description: For Assignment 10: Anagrams, the program below is used to find the possible anagrams of any given word
*/
import java.util.ArrayList;

public class AnagramList
{
  private final ArrayList<String> anagrams;

  /*
    Description: AnagramsList() is a constructor for the AnagramList class that represents all the anagrams of a word
    Input parameters:
      String word
    Output:
      creates an object representing the list of anagrams
  */
  public AnagramList(String word)
  {
    anagrams = new ArrayList<String>();
    // Add appropriate call to completeAnagrams here
    completeAnagrams("", word); //start should be empty since we want to rearrange all of the String aka end
    sortAnagrams();
  }

  /*
    Description: completeAnagrams() is the method that rearranges the input word to create an anagrams, which is added to our list
    Input parameters:
      String start, String end
    Output:
      adds anagrams to the anagram list
  */
  private void completeAnagrams(String start, String end)
  {
    if(end.length() <= 1) {
      anagrams.add(start + end); //if end is only 1 character or less, then there's no need to "rearrange" it, so we just add it onto start
    } else {
      for (int i = 0; i < end.length(); i++) {
        if (end.substring(0, i).indexOf(end.substring(i, i + 1)) < 0) { //checks if our current phrase contains the next character
          completeAnagrams(start + end.substring(i, i + 1), end.substring(0, i) + end.substring(i + 1)); //if not, we call the method again with updated parameters that will rearrange the String into a new anagram
        }
      }
    }
  }

  /*
    Description: sortAnagrams() sorts our anagram list into alphabetical order using an insertion sort
    Input parameters:
      none
    Output:
      rearranges the list to be in alphabetical order
  */
  private void sortAnagrams(){
    for (int i = 1; i < anagrams.size(); i++) {
      String temp = anagrams.get(i);
      int j;
      for (j = i; j > 0; j--) {
        if (temp.compareTo(anagrams.get(j - 1)) < 0) {
          anagrams.add(j - 1, anagrams.remove(j)); //if the current element is before the previous element in the alphabet, then we insert it to that element's spot
        }
      }
    }
  }

  /*
    Description: searchAnagrams() finds the location of the input within the list
    Input parameters:
      String target
    Output:
      returns the index of the element that is the same as the target
  */
  public int searchAnagrams(String target){
    for (int i = 0; i < anagrams.size(); i++) {
      if (anagrams.get(i).equals(target)) {
        return i; //return the location of the element when it is equal to our target
      }
    }
    return -1; //return -1 otherwise
  }

  /*
    Description: getAnagrams() returns the anagram list that we built
    Input parameters:
      none
    Output:
      returns an ArrayList of Strings of the anagram list
  */
  // Used to get list of anagrams externally, do not remove
  public ArrayList<String> getAnagrams()
  {
    return anagrams;
  }
}
