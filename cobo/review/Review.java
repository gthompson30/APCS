import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println(e);
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        posAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)) && word.charAt(0) != '*')
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    // THIS IS WRONG BECAUSE IT ASSUMES THAT THERE ARE THE SAME AMOUNT OF POSITIVE AS NEGATIVE ADJECTIVES
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  // A BETTER FUNCTION THAN THE CURRENT RANDOMADJECTIVE()
  /*public static String randomAdjective() {
    if (Math.random() <= posAdjectives.size()/(negAdjectives.size() + posAdjectives.size())) { // if positive adjective
      return posAdjectives.get((int) Math.random() * posAdjectives.size());
    }
    return negAdjectives.get((int) Math.random() * negAdjectives.size());                      // if negative adjective
  }*/

  public static double totalSentiment( String fileName) {
    String content = textToString(fileName);
    String[] words = content.split(" ");
    double value = 0.0;

    for (String word : words) {
      word = removePunctuation(word);
      value += sentimentVal(word);
    }

    return value;
  }

  public static int starRating(String fileName) {
    double totalSentiment = totalSentiment(fileName);
    if (totalSentiment > 15) return 4;
    if (totalSentiment > 10) return 3;
    if (totalSentiment > 5)  return 2;
    if (totalSentiment > 0)  return 1;
    return 0;
  }

  public static String fakeReview(String fileName) {
    String content = textToString(fileName);
    String[] words = content.split(" ");
    String punctuation;
    String output = "";
    boolean found;

    for (String word : words) {
      punctuation = getPunctuation(word);
      word = removePunctuation(word);
      found = false;

      if (word.charAt(0) == '*') {
        if (sentimentVal(word) >= 0) {
          for (int i = 0; i < posAdjectives.size() && !found; i++) {
            if (sentiment.get(posAdjectives.get(i)) > sentimentVal(word) && Math.random() < .01) { word = posAdjectives.get(i); }
          }
        } else {
          for (int i = 0; i < negAdjectives.size() && !found; i++) {
            if (sentiment.get(negAdjectives.get(i)) > sentimentVal(word) && Math.random() < .01) { word = negAdjectives.get(i); }
          }
        }
        //word = randomAdjective();
      }
      output += word + punctuation + " ";
    }

    return output;
  }

  /*public static String randomAdjective() {
    if (Math.random() <= posAdjectives.size()/(negAdjectives.size() + posAdjectives.size())) { // if positive adjective
      return posAdjectives.get((int) Math.random() * posAdjectives.size());
    }
    return negAdjectives.get((int) Math.random() * negAdjectives.size());                      // if negative adjective
  }*/

  public static void main(String[] args) {
    System.out.println(sentimentVal("fun"));
    System.out.println(sentimentVal("amazing"));
    System.out.println(sentimentVal("spectacular"));
    System.out.println(sentimentVal("ugly"));
    System.out.println(sentimentVal("hideous"));
    System.out.println(sentimentVal("wonderful"));

    System.out.println("\nSHORT POSITIVE REVIEW\n--------------");
    System.out.print("Total sentiment: ");
    System.out.println(totalSentiment("ShortPositiveReview.txt"));
    System.out.print("Star rating: ");
    System.out.println(starRating("ShortPositiveReview.txt") + " stars");

    System.out.println("\n\nLONG POSITIVE REVIEW\n--------------");
    System.out.print("Total sentiment: ");
    System.out.println(totalSentiment("LongPositiveReview.txt"));
    System.out.print("Star rating: ");
    System.out.println(starRating("LongPositiveReview.txt") + " stars");

    System.out.println("\n\nSHORT NEGATIVE REVIEW\n--------------");
    System.out.print("Total sentiment: ");
    System.out.println(totalSentiment("ShortNegativeReview.txt"));
    System.out.print("Star rating: ");
    System.out.println(starRating("ShortNegativeReview.txt") + " stars");

    System.out.println("\n\nLONG NEGATIVE REVIEW\n--------------");
    System.out.print("Total sentiment: ");
    System.out.println(totalSentiment("LongNegativeReview.txt"));
    System.out.print("Star rating: ");
    System.out.println(starRating("LongNegativeReview.txt") + " stars");

    System.out.println("\n\nGENERATED REVIEW:\n");
    System.out.println(fakeReview("LongPositiveReview.txt"));
  }
}
