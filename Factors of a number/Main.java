import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner scr = new Scanner(System.in);
	   int b= scr.nextInt();
	   int n1=0;
	   for(int i = 1;i<= b;i++)
	   {
	       if(b%i==0)
	       System.out.println(i);
	   }
	}
}