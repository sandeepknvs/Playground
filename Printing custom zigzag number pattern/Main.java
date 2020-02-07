import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
     int i,j;
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
for(i=1;i<=num;i++)
{
    int special=i+1;
    if(i%2==1)
    {
        for(j=1;j<=num-1;j++)
        {
            System.out.print(i);
        }
        System.out.println(special);
       
    }
    else if(i%2==0)
    {
       System.out.print(special);
        for(j=1;j<=num-1;j++)
        {
           System.out.print(i);
        }
       System.out.println();
    }
}
	}
 
}