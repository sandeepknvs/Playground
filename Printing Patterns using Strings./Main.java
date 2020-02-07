import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
         Scanner scr = new Scanner(System.in);
       String str1 = scr.nextLine();
       int size = str1.length();
        StringBuilder sb = new StringBuilder(str1);
        StringBuilder temp = new StringBuilder("");
        
        for(int i = size/2 ; i < size; i++)
        {
            char ch = sb.charAt(i);
            temp.append(ch);
        }
         
        for(int i = 0; i < size/2; i++)
        {
            char ch = sb.charAt(i);
            temp.append(ch);
            
        }
        int k = size;
        int a = 1;
         for(int i = 0; i < size; i++)
       {
           for(int i1 = 0; i1 < k - 1 ; i1++)
           {
               System.out.print(" ");
           }k--;
             
             for(int i1 = 0; i1 < a; i1++)
             {
                 System.out.print(temp.charAt(i1));
             }
             a++;
             System.out.println();
        }
    }
}