import java.util.*;
import java.io.*;
class Main{
    static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;
    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
      while (st == null || !st.hasMoreElements()){
        try { st = new StringTokenizer(br.readLine()); }
        catch (IOException e) { e.printStackTrace(); }
      }
      return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble(){ return Double.parseDouble(next()); }
    String nextLine(){
      String str = "";
      try { str = br.readLine(); }
      catch (IOException e) { e.printStackTrace(); }
      return str;
    }
  }
  public static void main(String[] args){
  
  	FastReader fr = new FastReader();
  	
  	int i = fr.nextInt();
  	int j = fr.nextInt();
  	int moves = fr.nextInt();
  	
  	int[][] board = new int[10][10];
  	
  	for (int[] row : board)
            Arrays.fill(row, 0);
  	
  	ghodeKiChaal(i,j,board,moves);
  	int count = printBoard(board);
  
  	System.out.println(count);
  
  }
  
  public static void ghodeKiChaal(int row,int col,int[][] board,int moves){
      //boundary conditions
      if(row < 0 || col<0 || row>=board.length || col >board.length){
          return ;
      }
      
      if(moves==0){
         board[row-1][col-1] = 1;
         return;
     }
      
      
      //rec calls
      
          //up left
          ghodeKiChaal(row-2,col-1,board,moves-1);
          //up right
          ghodeKiChaal(row-2,col+1,board,moves-1);
          //down left
          ghodeKiChaal(row+2,col-1,board,moves-1);
          //down right
          ghodeKiChaal(row+2,col+1,board,moves-1);
          //left up
          ghodeKiChaal(row-1,col-2,board,moves-1);
          //left down
          ghodeKiChaal(row+1,col-2,board,moves-1);
          //right up
          ghodeKiChaal(row-1,col+2,board,moves-1);
          //right down
          ghodeKiChaal(row+1,col+2,board,moves-1);
      
      
  }
  
  public static int printBoard(int[][] board){
      int count = 0;
      
      	for(int m=0;m<10;m++){
  	    for(int n=0;n<10;n++){
  	        System.out.print(board[m][n]+" ");
  	        if(board[m][n]==1){
  	            count++;
  	        }
  	    }
  	    System.out.println();
  	}
  	
  	 return count;
  }
}
