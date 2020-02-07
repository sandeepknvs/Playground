import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
     int num_given = in.nextInt();
     int r=0;
     int b=0;
     int k=0;
      b = num_given%10;
     while(num_given>=10)
     {
      num_given = num_given/10;
     }
     
      k =num_given+b;
     System.out.println(k);
	}
}