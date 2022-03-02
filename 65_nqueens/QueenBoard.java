/*
Team Tame Meat Mate Meta (Gabriel Thompson, Kartik Vanjani)
APCS
HW65 -- NQUEENS
2022-02-16
time spent: 0.4hrs in class + 0.5hrs at home = 0.9hrs TOTAL
*/

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

import java.util.ArrayList;

public class QueenBoard
{

  public int[][] _board;
  public long calls;

  public QueenBoard( int size ) 
  {
      int calls = 0;
      _board = new int[size][size];
  }

  /***
   * precondition: board is filled with 0's only.
   * postcondition: board is filled with valid solution to n-queens problem of size "size". "true" is returned
                    OR
                    board is empty. "false" is returned
   * If a solution is found, board shows position of N queens, 
   * returns true.
   * If no solution, board is filled with 0's, 
   * returns false.
   */
  public boolean solve()
  {
      calls = 0;
      return solveH(0);
  }

  /**
   *Helper method for solve.
   */
  private boolean solveH( int col ) 
  {
      calls++;
      for (int row = 0; row < _board.length; row++) {
          if (addQueen(row, col)) {
              if ((col == _board.length - 1) || (solveH(col + 1)))
                  return true;
              removeQueen(row, col);
          }
      }
      return false;
  }


  public void printSolution()
  {
      for (int[] row : _board) {
          for (int item : row) {
              if (item <= 0) System.out.print("_ ");
              else System.out.print("Q ");
          }
          System.out.println();
      }
  }


  //================= YE OLDE SEPARATOR =================

  /***
   * If possible, adds queen at the provided row and col
   * precondition: _board exists, row and col are both < than size
   * postcondition: a queen is placed at row and col, provided that there wasn't already a queen there
   */
  private boolean addQueen(int row, int col)
  {
      if(_board[row][col] != 0){
          return false;
      }

      _board[row][col] = 1;
      int offset = 1;

      while(col+offset < _board[row].length){
          _board[row][col+offset]--;
          if(row - offset >= 0){
              _board[row-offset][col+offset]--;
          }
          if(row + offset < _board.length){
              _board[row+offset][col+offset]--;
          }
          offset++;
      }
      return true;
  }


  /***
   * If possible, removes queen at the provided row and col
   * precondition: _board exists, row and col are both < size
   * postcondition: if a queen is placed at the row and col, it is removed and its the places which it can attack are reset to 0
   */
  private boolean removeQueen(int row, int col){
      if ( _board[row][col] != 1 ) {
          return false;
      }
      _board[row][col] = 0;
      int offset = 1;

      while( col+offset < _board[row].length ) {
          _board[row][col+offset]++;
          if( row - offset >= 0 ) {
              _board[row-offset][col+offset]++;
          }
          if( row + offset < _board.length ) {
              _board[row+offset][col+offset]++;
          }
          offset++;
      }
      return true;
  }


  /***
   * Returns a stringified version of _board
   * precondition: _board exists
   * postcondition: a string version of _board is returned
   */
  public String toString()
  {
      String ans = "";
      for( int r = 0; r < _board.length; r++ ) {
          for( int c = 0; c < _board[0].length; c++ ) {
              ans += _board[r][c]+"\t";
          }
          ans += "\n";
      }
      return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    ArrayList<Long> a = new ArrayList<Long>();
    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    /** should be...
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
       0	1	-1	-2	-1	
       0	0	-2	0	0	
       0	-1	0	-1	0	
       1	-1	-1	-1	-2	
       0	-1	0	0	0	
    */

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1	-1	
       0	0	-1	0	0	
       0	0	0	-1	0	
       0	0	0	0	-1	
       0	0	0	0	0	 
    */

    boolean showBoards = true;
    System.out.println("CAN THE FOLLOWING N X N BOARDS BE SOLVED??");
    for (int i = 1; i < 50; i++) {
       b._board = new int[i][i];
       System.out.println(i + "x" + i + "  |  " + b.solve() + " | " + b.calls);
       if (showBoards) b.printSolution();
       a.add(b.calls);
       System.out.println(a);
    }

    System.out.println("\n...it appears that all NxN boards can be solved such that N≤1 ∪ N≥4");
  }

}//end class
