import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
       Scanner scr = new Scanner(System.in);
     int num = scr.nextInt();
     for(int no = 1; no <= num*2; no++)
     {
        if(no%2==1)
        
            System.out.println(no);
        
     }
	}
}