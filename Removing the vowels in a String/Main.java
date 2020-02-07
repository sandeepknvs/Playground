import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
       Scanner scr = new Scanner(System.in);
       String str = scr.nextLine();
       StringBuilder sb = new StringBuilder(str);
       StringBuilder sb1 = new StringBuilder("");
        int size = sb.length();
       for(int i = 0;i < size; i++)
       {
           char ch = sb.charAt(i);
           if((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch !='u'))
           {
               sb1.append(ch);
           }
           
       }System.out.println(sb1);
        
        
    }
}