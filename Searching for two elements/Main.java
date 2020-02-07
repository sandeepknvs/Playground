import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        Scanner scr = new Scanner(System.in);
      int array_size  = scr.nextInt();
      int arr[] = new int[array_size];
      for(int index = 0; index <= array_size-1; index++)
      {
        arr[index] = scr.nextInt();
      }
      int search_element1= scr.nextInt();
      int search_element2 = scr.nextInt();
      int flag1= 0;
      int flag2 = 0;
        int index;
        int r1 = 0;
        int r2 = 0;
      for( index = 0; index <= array_size-1;index++)
      {
       
          if(search_element1==arr[index])
          {
            flag1=1;
              r1 = index;
          }
           if(search_element2 ==arr[index])
          {
            flag2=1;
               r2 = index;
          }
      }
          if(flag1==1)
          {
            System.out.println(r1);
          }
          else
          {
            System.out.println("-1");
          }
          
          if(flag2==1)
          {
            System.out.println(r2);
          }
          else
          {
            System.out.println("-1");
          }
    }
}