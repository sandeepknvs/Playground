import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
      int base = scr.nextInt();
      int exponent = scr.nextInt();
      
      int s=power(base,exponent);
       System.out.println(s);
	}
  static int power(int base,int exponent)
  {
      int s=1;
      for(int i = 1;i<=exponent;i++)
      {
          s = s*base;
      }
     
     return s;
  }
}
