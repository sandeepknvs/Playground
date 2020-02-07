import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner scr = new Scanner(System.in);
    int scr1 = scr.nextInt();
    int scr2=0;
    while(scr1>99)
    {
      scr1 = scr1/10;
      
    }
    scr1 = scr1%10;
    
    System.out.println(scr1);
	}
}
