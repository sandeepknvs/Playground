import java.util.Scanner;
 class Main 
{
    public static void main(String[] args) 
    {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        int n2 = scr.nextInt();
        for(int i = 0; i < size; i++)
        {
            arr1[i] = scr.nextInt();
        }
        for(int i = 0; i < size; i++)
        {
            for(int j =  i + 1; j < size; j++)
            {
                if(arr1[i] > arr1[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
      
        
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = 0; 
        }
        for(int i = 0 ; i < size; i++)
        {
            int temp = arr1[i];
            arr2[temp - 1]++;
            
        }
       
        int k = 1;
        for(int j = 0; j < n2; j++)
        {
            System.out.println(j+1+" "+arr2[j]);
            k++;
        }
    }
}