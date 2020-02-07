import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
       Scanner scr = new Scanner(System.in);
       int size1 = scr.nextInt();
       int size2 = scr.nextInt();
       int arr1[][] = new int[size1][size2];
       int arr2[][] = new int[size1][size2];
       int arr3[][] = new int[size1][size2]; 
       for(int i = 0; i < size1; i++)
       {
           for(int j = 0; j < size2; j++)
           {
               arr1[i][j] = scr.nextInt();
           }
       }
        for(int i = 0; i < size1; i++)
       {
           for(int j = 0; j < size2; j++)
           {
               arr2[i][j] = scr.nextInt();
           }
       }
        
         for(int i = 0; i < size1; i++)
       {
           for(int j = 0; j < size2; j++)
           {
               if(arr1[i][j] == arr2[i][j])
               {
                   arr3[i][j] = 1;
               }
              
           }
       }
        boolean isTrue = false;
         for(int i = 0; i < size1; i++)
       {
           for(int j = 0; j < size2; j++)
           {
              if(arr3[i][j] != 1)
              {
                  isTrue = true;
              }
           }
       }
        
        if(isTrue == false)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}