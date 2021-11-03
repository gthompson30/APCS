/***
 * Nacho Patcho (Gabriel Thompson + Iggy, Jacob Ng + PreGuac, Faiza Huda + Truthful Tom)
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-03w
 * time spent: _hrs
 *
 * class Pig
 * a Pig Latin translator
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
    for ( int i = 0 ; i < w.length() ; i++ ) {
      if ( w.charAt(i) == letter ) {
        return true;
      }
    }
    
    return false;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
    return hasA(VOWELS, letter);
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
    int count = 0;
    
    for ( int i = 0 ; i < w.length() ; i++ ) {
      if ( isAVowel(w.charAt(i)) ) {
        count++;
      }
    }
    return count;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
    // you could utilize countVowels() for this, but then if there's multiple, you're counting unnecessary ones
    for ( int i = 0 ; i < w.length() ; i++ ) {
      if (isAVowel(w.charAt(i))) {
        return true;
      }
    }
    return false;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
    String onlyVowels = "";
    
    for ( int i = 0 ; i < w.length() ; i++ ) {
      char c = w.charAt(i);
      
      if (isAVowel(c)) {
       onlyVowels += c;
      }
    }
    return onlyVowels;
  }


  public static void main( String[] args ) 
  {
    /* YOUR TEST CALLS HERE */
  }//end main()

}//end class Pig
