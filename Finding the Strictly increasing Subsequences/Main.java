import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = scr.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < size; i++)
        {
           for(int j = i + 1; j < size; j++)
           {
               if((arr[i] < arr[j]) && (arr[j] > arr[j - 1]))
               {
                    temp = arr[j];
                   System.out.println(arr[i]+","+temp);
               }
           }
        }
    }
}