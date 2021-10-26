/*
Gabriel Thompson and Kevin Li
APCS
HW24 - Get It While You Can
2021-10-25
time spent: .8 hours
QCC:
    - What is it about classes that makes us use .equals() to compare them instead of using == like with integer variables?
DISCO: 
    - We internalized the structure of while lopps while working on until divisible. The While loops don't run simultaneously
    - To call methods from main, those methods must be static
*/

import java.util.Random;

/***
 *  class Coin
 *  by Gabriel Thompson and Kevin Li
 *  SKELETON't
 ***/

public class Coin {

  private String upFace;
  private int flipCtr;
  private double value;
  private int headsCtr;
  private int tailsCtr;
  private double bias;
  private String name;


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
    name = "quarter";
    value = 0.25;
    upFace = "heads";
    bias = 0.5;
    headsCtr = 0;
    tailsCtr = 0;
    flipCtr = 0;
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  
  public Coin( String s ) {
  	assignValue(s);
        upFace = "heads";
        bias = 0.5;
        headsCtr = 0;
        tailsCtr = 0;
        flipCtr = 0;
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  
  public Coin( String s, String nowFace ) {
  	assignValue(s);
  	
  	if (nowFace == "heads") {
  		upFace = "heads";
  	} else if (nowFace == "tails") {
  		upFace = "tails";
  	} else {
  		System.out.println("Invalid face type: " + nowFace);
  	}
        bias = 0.5;
        headsCtr = 0;
        tailsCtr = 0;
        flipCtr = 0;
  }
  
  
  // Accessors...
  // ----------------------------
  public String getUpFace() {
  	return upFace;
  }

  public int getFlipCtr() {
  	return flipCtr;
  }

  public double getValue() {
	return value;
  }

  public int getHeadsCtr() {
	return headsCtr;
  }

  public int getTailsCtr() {
	return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
	if (s.equals("penny")) {
		value = 0.01;
  	} else if (s.equals("nickel")) {
  		value = 0.05;
  	} else if (s.equals("dime")) {
  		value = 0.10;
  	} else if (s.equals("quarter")) {
  		value = 0.25;
  	} else if (s.equals("half dollar")) {
  		value = 0.50;
  	} else if (s.equals("dollar")) {
  		value = 1.00;
  	} else {
      System.out.println("Error: invalid coin denomination");
      return 0.0;
    }
    name = s;
  	
  	return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    if ( (s == "heads") || (s == "tails") ){
      name = s;
    }
    if ( (d >= 0.0) && (d <= 1.0) ) {
      bias = d;
    }
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    if (Math.random() > bias) {
      tailsCtr++;
      upFace = "tails";
    }
    else {
      headsCtr++;
      upFace = "heads";
    }
    flipCtr++;
    return upFace;
  }

  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    return upFace == other.upFace;
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    String out = "\n";
    out += "name: " + name + "\n";
    out += "face: " + upFace + "\n";
    return out;
  }
  
}//end class
