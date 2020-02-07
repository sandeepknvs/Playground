import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
       Scanner scr = new Scanner(System.in);
       int a = scr.nextInt();
       int b = factorial(a);
       System.out.println(b);
    }
    public static int factorial(int a)
    {
        if(a == 1)
            return 1;
        int c = a + factorial(a - 1);
        return c;
    }
}