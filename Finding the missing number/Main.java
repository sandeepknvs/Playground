import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < size; i++)
        {
            arr[i] = scr.nextInt();
        }
        int a = 0; 
        for(int i = 1; i <= size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(i == arr[j])
                {
                    a = 1;
                    break;
                }
                else
                    a = 0;
                
                
            }
            if(a == 0)
                System.out.print(i+" ");
        }
    }
}