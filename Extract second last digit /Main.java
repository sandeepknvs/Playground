import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int y = n /10;
      int k = y %10;
      System.out.println(k);
	}
}