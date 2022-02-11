/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Sort Algorithm:
     I. Is the inputted array of length 1?
         a. Yes!
            -> Return the array, because arrays of length 1 are always sorted.
         b. No!
            -> Continue to step II
    II. Calculate the middle index of the array
   III. Create two separate arrays, each of which represent the left and right part of the input array, spliced at the calculated middle index.
    IV. Call the sort() function on each of the halves, to sort each half.
     V. Merge the two halves, through the "Merge" algorithm.
    VI. Return the merged halves. This is the sorted array.

  Summary of Merge Algorithm:
     I. Create an empty output array.
    II. Initialize two variables, aPos and bPos, to keep track of the current position we're looking at in each array. Both aPos and bPos are set to 0.
   III. Repeat the following until aPos reaches the end index of the first array or bPos reaches the end index of the second array:
         a. Compare the value in the first array at aPos with the value in the second array at bPos.
         b. Is the value at aPos is smaller than the value at bPos?
            i. Yes!
               -> add the value at aPos to the output array. Increment aPos by 1.
           ii. No!
               -> add the value at bPos to the output array. Increment bPos by 1.
    IV. Once you've finished adding all of the elements from either of the arrays, add all unadded elements to the end of the output array.
     V. Return the output array.

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
       output[addedToOutput] = a[i];
       addedToOutput++;
     }
     for (int i = bPos; i < b.length; i++) {
       output[addedToOutput] = b[i];
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
    for (int i = 0; i < midPoint; i++) {
      firstHalf[i] = arr[i];
    }
    for (int i = 0; i < secondHalf.length; i++) {
      secondHalf[i] = arr[i + midPoint];
    }
    firstHalf = sort(firstHalf);
    secondHalf = sort(secondHalf);

    return merge(firstHalf, secondHalf);
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

  public static void bubbleSortV( int[] data )
  {
    for (int passNum = 0; passNum < data.length - 1; passNum++) {
      for (int index = data.length - 1; index > passNum; index--) {
        Comparable previous = data[index - 1];
        Comparable current = data[index];
        int comparison = previous.compareTo(current);

        if (comparison > 0) {
          data[index] = previous;
          data[index - 1] = current;
        }
      }
    }
  }

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

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );

      // TEAM TAME MEAT MATE META SPEED TEST
      int[] arr8 = new int[1000000];
      for (int i = 0 ; i < arr8.length ; i++)
        arr8[i] = (int) (Math.random() * 10000000);

      long startTime = System.currentTimeMillis();
      int[] sortedArr8 = sort( arr8 );
      long endTime = System.currentTimeMillis();
      int[] firstSample = new int[1000];
      for (int i = 0; i < firstSample.length; i++)
        firstSample[i] = sortedArr8[i];
      printArray(firstSample);

      System.out.println("SORTED! In only " + (endTime - startTime) + "ms.");

      startTime = System.currentTimeMillis();
      bubbleSortV(arr8);
      endTime = System.currentTimeMillis();
      System.out.println("SORTED! In only " + (endTime - startTime) + "ms.");
    /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
