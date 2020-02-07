import java.util.Scanner;
class Main{
      public static void main(String args[])
    {
     Scanner scr = new Scanner(System.in);
     int array_size = scr.nextInt();
     int arr[] = new int[array_size];
     for(int i =0;i<array_size;i++)
     {
         arr[i] = scr.nextInt();
     }
        int no = scr.nextInt();
     equal_subset(arr,array_size,no);
     }
    public static void equal_subset(int arr[],int array_size,int no)
    {
        int count = 0;
        for(int i = 0;i<array_size;i++)
        {
            for(int elem = i+1; elem < array_size;elem++)
            {
                count  = arr[i]+arr[elem];
                if(no == count)
                {
                    System.out.println(""+arr[i]+", "+arr[elem]+"");
                }
                
                count = 0;
                    
            }
        }
        
    }
}