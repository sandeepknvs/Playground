import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	Scanner scr = new Scanner(System.in);
		int input = scr.nextInt();
		int count = 1;
		for(int i =1;i<=input;i++)
		{
		    for(int j = 1;j<=i;j++)
		    {
		        System.out.print(count);
		    }
		    System.out.println();
		    count = count + 1;
		}
	}
}