
import java.util.Scanner;

class Main{
  static int square(int num)
  { 
      int k=0;
    for(int i=num;i>=1;i--)
    {
     
      k=k+i;
    }
    return k;
  }
	public static void main (String[] args){
	    // Type your code here
       Scanner scr =new Scanner(System.in);
      int num = scr.nextInt();
       
      int c =square(num);
      int r=c;
      System.out.println(r);
	}
}