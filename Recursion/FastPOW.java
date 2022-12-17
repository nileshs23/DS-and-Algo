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
  	
    int ans = fastPow(i,j);
    System.out.println(ans);
  
  }
  
  public static int fastPow(int i,int j){
      //boundary conditions
      if(j==0) return 1;
    
    //calculations
    int smallPow = fastPow(i,j/2);
    smallPow = smallPow * smallPow;
    
    if(j%2==1){
    smallPow = smallPow+i;
    }
      
    return smallPow;
  }
  
}
