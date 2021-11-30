/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// Clyde "Thluffy" Sinclair
// APCS pd0
// HW40 -- 2D arrays
// 2021-11-30

public class TwoDimArray
{

  public static void printArray( int[] a ) {
    System.out.print("{");

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i < a.length - 1)
        System.out.print(", ");
    }
    System.out.print("}");
  }

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    System.out.println("{");
    for (int subIndex = 0; subIndex < a.length; subIndex++) {
      System.out.print("  ");
      printArray(a[subIndex]);
      if (subIndex < a.length - 1)
        System.out.print(",");
      System.out.println();
    }
    System.out.println("}");
  }

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    // YOUR IMPLEMENTATION HERE
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    return 0;
    // YOUR IMPLEMENTATION HERE
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    return 0;
    // YOUR IMPLEMENTATION HERE
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    return 0;
    // YOUR IMPLEMENTATION HERE
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    return summer;
  }


  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
