import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
       Scanner scr = new Scanner(System.in);
     int num = scr.nextInt();
     int sum = 0;
     for(int no = 1; no <= num; no++)
     {
       sum = sum + no;
     }
     System.out.println(sum);
	
	}
}