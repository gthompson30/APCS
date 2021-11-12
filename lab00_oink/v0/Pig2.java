/***
 * Clyde "Thluffy" Sinclair, Joshua "Quacker" Yagupsky
 * APCS
 * L00 -- Pig Latin translation
 * 2021-11-08
 * time spent: ?hrs
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

// code to be added to your growing Pig Latin translator

public class Pig2 {

	private static final String START_VOWELS = "aeiou";
	private static final String REST_VOWELS = "aeiouy";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";
    private static final String YCHAR = "¥";
    private static final String CAPCHAR = "ç";

	public static boolean inString(char c, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}

	public static boolean isVowel(char c) {
		return inString(c, "aeiouAEIOUY");
	}

	public static boolean isVowelY(char c) {
		return inString(c, "aeiouyAEIOUY");
	}

	public static String translate(String word) {
		char first = word.charAt(0);
		if (isVowel(first)) {
			return word + "way";
		}

		int index = 0;
		while (!isVowelY(word.charAt(index))) {
			index++;
		}
		return word.substring(index) + word.substring(0, index) + "ay";
	}

    public static boolean isPunc( String symbol ) {
	    return PUNCS.indexOf( symbol ) != -1;
    }


    public static boolean isUpperCase( String letter ) {
      return CAPS.indexOf(letter) != -1;
    }
    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/
    public static boolean beginsWithUpper( String w ) {
	    return isUpperCase(w.substring(0,1) );
    }

  public static void main( String[] args ) {

     for( String word : args ) {
       System.out.println( translate(word) );
     }



  }//end main()

}//end class Pig
