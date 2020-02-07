import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
     // System.out.println("string:"); 
       Scanner scr = new Scanner(System.in);
       String main = scr.nextLine();
       //System.out.println("substring to be replaced:"); 
       String have_to_rep = scr.nextLine(); 
        //System.out.println("string to be included:");
        String replace_with = scr.nextLine();
        String string = main.replace(have_to_rep , replace_with);
        System.out.println(string);
    }
}