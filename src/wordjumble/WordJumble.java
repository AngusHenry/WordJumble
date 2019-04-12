/*
 * Angus Henry
 *This program will jumble words that are provided from the user
 * 12/04/2019
 */

package wordjumble;

import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String letters = JOptionPane.showInputDialog(
      "What word do you want to jumble \n");
    jumbleWords(letters, "");
    }
    public static void jumbleWords(String word, String jumbLet) {
    int pos;
    String remainingLetters;
    String origWord = word;
    String origJumbledLetters = jumbLet;
    if (word.length() == 1) {
      System.out.println(jumbLet + word);
    } else {
      for (pos = 0; pos < origWord.length(); pos++) {
        remainingLetters = origWord.substring(0, pos)
          + origWord.substring(pos + 1, origWord.length());
        //recursive call to jumbleWords()
        jumbleWords(remainingLetters, 
          origJumbledLetters + origWord.charAt(pos));
      }
    }
  }
}