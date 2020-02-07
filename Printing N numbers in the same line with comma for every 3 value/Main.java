import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    	 Scanner scr = new Scanner(System.in);
    int num = scr.nextInt();
    int count=1;
    for(int i = 1;i<=num;i++){
      
      System.out.print(i);
      count = count+1;
      if(count==4){
        System.out.print(",");
          count=1;
      }
    }
  }
}