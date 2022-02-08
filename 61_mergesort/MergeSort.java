/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
     int[] output = new int[a.length + b.length];
     int addedToOutput = 0;
     int aPos = 0;
     int bPos = 0;
     boolean done = false;

     while (!done) {
       if (a[aPos] >= b[bPos]) {
         output[addedToOutput] = b[bPos];
         bPos++;
       } else {
         output[addedToOutput] = a[aPos];
         aPos++;
       }

       addedToOutput++;

       if (aPos >= a.length || bPos >= b.length) {
         done = true;
       }
     }

     for (int i = aPos; i < a.length; i++) {
       output[addedToOutput] = a[aPos];
       addedToOutput++;
     }
     for (int i = bPos; i < b.length; i++) {
       output[addedToOutput] = b[bPos];
       addedToOutput++;
     }

     return output;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    if (arr.length <= 1)
      return arr;

    int midPoint = arr.length / 2;
    int[] firstHalf = new int[midPoint];
    int[] secondHalf = new int[arr.length - midPoint];
    for (int i = 0; i < firstHalf; i++) {
      firstHalf[i] = arr[i];
    }
    for (int i = 0; i < secondHalf.length; i++) {
      secondHalf[i] = arr[i + midPoint];
    }
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1, arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

    /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
