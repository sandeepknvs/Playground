import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
     int num_given = in.nextInt();
    
     int quotient = 0;
     
     while(num_given!=0)
     {
        quotient = quotient + num_given%10;
        num_given = num_given/10;
     }
     System.out.println(quotient);
	
	}
}