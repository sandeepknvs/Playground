import java.util.Scanner;
class Main{
   public static int greater(int a,int b)
      {
        if(a < b)
          return b;
        else
          return a;
      }
	public static void main (String[] args){
	    // Type your code here
      Scanner scr = new Scanner(System.in);
      int a  = scr.nextInt();
      int b  = scr.nextInt();
      int c  = scr.nextInt();
     
      int d = greater(a,b);
     
      int e = greater(d,c);
      System.out.println(e);
	}
}