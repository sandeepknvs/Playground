import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int rows, columns, i, j;
     Scanner sc = new Scanner(System.in);
		
		
	 rows = sc.nextInt();	
		
		
		  columns = rows;
		
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= columns; j++)
			{
				if(i == 1 || i == rows || j == 1 || j == columns)
				{
					System.out.print("*"); 
				}
				else
				{
					System.out.print(" "); 
				}
			}
			System.out.print("\n"); 
		}	
        
	}
}