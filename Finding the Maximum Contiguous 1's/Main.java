
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
        int count = 0;  
        for(int i = 0; i < size; i++)
        {
            if(arr[i] == 1)
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}


