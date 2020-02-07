import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner scr = new Scanner(System.in);
	int num = scr.nextInt();

	int b=num;
	int count =0;
	for(int i=1;i<=num;i++)
	{
	   for(int j=b;j>=1;j--)
	   {
	       System.out.print(j);
	   }System.out.println();
	   b = b-1;
	}

	}
}