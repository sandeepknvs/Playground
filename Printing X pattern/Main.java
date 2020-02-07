import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int i,j;
        for( i = 1;i <= num;i++)
        {
            for(j = 1;j <= num;j++)
            {
                if(j == i)
                    System.out.print("*");
                else if(j == num-(i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}
}