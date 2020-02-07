import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int array[] = new int[size];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = scr.nextInt();
        }
        int new_array[] = new int[size];
        int a = 0;
        for(int i = 0; i < array.length;i++)
        {
            if(array[i]>0)
            {
                new_array[a] = array[i];
                a++;
            }
        }
         for(int i = 0 ; i <new_array.length; i++)
        {
            System.out.print(new_array[i]+" ");
        }
    }
}