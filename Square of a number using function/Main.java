import java.util.Scanner;
class Main
{
	  static int square(int num)
      {
        int b = num*num;
         return b;
      }
     
      
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner scr =new Scanner(System.in);
      int num = scr.nextInt();
      
      int c =square(num);
      int r=c;
      System.out.println(r);
	} 
}