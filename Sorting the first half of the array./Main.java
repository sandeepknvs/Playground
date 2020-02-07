import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
        int count = 0;
        for(int i = 0; i < size; i++)
        {
            arr[i] = scr.nextInt();
        }
        int a = size/2;
        for(int j = 0; j < a; j++)
        {
            for(int i = 0; i < size/2 - 1; i++)
            {
                if(arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            a--;
        }
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }  
      
}