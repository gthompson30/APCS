// Clyde Sinclair
// APCS pd0
// HW68 -- recursively probing for a closed cycle
// 2022-02-28m
// time spent:  hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 *  1. Calculate all tiles that the knight at (lastKnightRow, lastKnightCol) can go to
 *  2. If the length of this list is zero (indicating that the knight can’t move anywhere)... 
 *Return an empty array. This will end the function.
Otherwise, iterate through each possible tile to move the knight. For each, do the following...
Mark the tile with a number one higher than the current value at (lastKnightRow, lastKnightCol)
Call knightsTour() with the modified board and the current row and col being altered as arguments
If the result of the function call is not an empty array...
Return this result
Otherwise, remove the knight, and go back to (3) for the next possible tile.
If you’ve gotten this far without returning, return an empty board.

 *
 * DISCO
 *
 * QCC
 *
 * Mean execution times for boards of size n*n:
 * n=5   0.029s    across 594318 executions
 * n=6   0.101s    across 18984736 executions
 * n=7   0.104s    across 20091201 executions
 * n=8   Didn't run in time s    across NaN executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 5;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    //System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    int startX = (int) (2 + (Math.random() * n));
    int startY = (int) (2 + (Math.random() * n));
    tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    for (int row = 2; row < n + 2; row++) {
      for (int col = 2; col < n + 2; col++) {
        tf.findTour(row, col, 1);
      }
    }

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;
  private long startTime = System.currentTimeMillis();
  private int executions = 0;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {

    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[n+4][n+4];


    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for(int row = 0; row<n+4; row++){
      for (int col = 0;  col<n+4; col++){
        _board[row][col] = -1;
      }
    }
    for(int row = 2; row < n+2; row++){
      for (int col = 2; col<n+2; col++){
        _board[row][col] = 0;
      }
    }
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/
  public void findTour( int x, int y, int moves )
  {
    executions++;
    //delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if (_solved) {
	long end = System.currentTimeMillis();
        System.out.println(end - startTime);
        System.out.println(executions);
	System.exit(0);
    }

    //primary base case: tour completed
    if (moves == (_sideLength * _sideLength) && _board[y][x] == 0) {
      _solved = true;
      _board[y][x] = _sideLength * _sideLength;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if (_board[y][x] != 0) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[y][x] = moves;

      //delay(1000); //uncomment to slow down enough to view

      /**********************g********************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      moves++;
      findTour(x + 2, y + 1, moves);
      findTour(x - 2, y + 1, moves);
      findTour(x + 2, y - 1, moves);
      findTour(x - 2, y - 1, moves);
      findTour(x + 1, y + 2, moves);
      findTour(x - 1, y + 2, moves);
      findTour(x + 1, y - 2, moves);
      findTour(x - 1, y - 2, moves);

      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
    }

    _board[y][x] = 0;
  }//end findTour()

}//end class TourFinder
