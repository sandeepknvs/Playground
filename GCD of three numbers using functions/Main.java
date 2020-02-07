import java.util.Scanner;
public class Main{
   static int greater(int a,int b)
      {
         int min_element,gcd = 0;
        if(a < b)
          min_element = a;
        else
          min_element = b;
         while(min_element >= 0)
         {
             if((a % min_element == 0 )&&(b % min_element == 0))
             {
                 gcd = min_element;
                 break;
             }
             min_element--;
         }
         return gcd;
      }
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner scr = new Scanner(System.in);
      
      int a  = scr.nextInt();
      int b  = scr.nextInt();
      int c  = scr.nextInt();
     
      int d = greater(a,b);
     
      int e = greater(d,c);
      System.out.println(e);
	}
}