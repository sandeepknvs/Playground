import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scr = new Scanner(System.in);
      int n1 = scr.nextInt();
      int n2 = n1%10;
      int n3 = n1/10;
      int n4 = n2+n3;
      System.out.println(n4);
	}
}