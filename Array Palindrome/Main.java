import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        // Type your code here
       Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        int size1 = arr1.length;
        for(int i = 0; i < size1; i++)
        {
            arr1[i] = scr.nextInt();
        }
        for(int i = 0; i < size1; i++)
        {
            arr2[i] = arr1[i];
        }
        
        int begin = 0;
        int end = size1 - 1;
        while(begin < end)
        {
            int temp = arr2[begin];
            arr2[begin] = arr2[end];
            arr2[end] = temp;
            begin++;
            end--;
        }
        
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}