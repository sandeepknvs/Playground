import java.util.*;
import java.lang.*;

class Main
{  
    public static void main(String args[])
    {
       Scanner scr = new Scanner(System.in);
        int row_size = scr.nextInt();
        int col_size = scr.nextInt();
        int arr1[][] = new int[row_size][col_size];
        int arr2[][] = new int[row_size][col_size];
       
        for(int i = 0; i < row_size; i++)
        {
            for(int j = 0;j < col_size; j++)
            {
                arr1[i][j] = scr.nextInt();
            }
        }
        
        
        
        for(int i = 0; i < row_size; i++)
        {
            for(int j = 0;j < col_size; j++)
            {
                arr2[j][i] = arr1[i][j];
            }
        }
        
        
        for(int i = 0; i < row_size ; i++)
        {
            for(int j = 0;j < col_size ; j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}