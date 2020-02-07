import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
        Scanner scr = new Scanner(System.in);
	   int b= scr.nextInt();
	   int n1=1;
	   for(int i = 1;i<= b;i++)
	   {
	      n1= n1*i;
	   }
	   System.out.println(n1);
	}
}