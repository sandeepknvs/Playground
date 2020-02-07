import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scr = new Scanner(System.in);
      int a = scr.nextInt();
      int b = scr.nextInt();
      int c = scr.nextInt();
      if(a>b&&a>c)
        System.out.println(a);
      else if(b>a&&b>c)
        System.out.println(b);
      else if(c>a&&c>b)
        System.out.println(c);
      else
        System.out.println("the numbers are not distinct");

    }
}