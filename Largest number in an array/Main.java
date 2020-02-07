import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner scr = new Scanner(System.in);
      int array_size = scr.nextInt();
      int arr[] = new int[array_size];
      for(int index = 0 ;index<=array_size-1;index++)
      {
        arr[index] = scr.nextInt();
      }
      int largest = arr[0];
      for(int index = 0; index<= array_size-1;index++)
      {
        if(largest < arr[index])
            {
                largest = arr[index];
            }
      }
           System.out.println(largest);
    }
}