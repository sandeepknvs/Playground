import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      	Scanner scr = new Scanner(System.in);
	int num = scr.nextInt();

	
	int count =0;
	for(int i=1;i<=num;i++)
	{
	    for(int j=1;j<=(num-i);j++)
	    {
	        System.out.print(" ");
	    } 
	    
	    for(int j =1;j<=i+count;j++)
	    {
	        System.out.print("*");
	    }System.out.println();
	   count = count+1;
	}
	}
}