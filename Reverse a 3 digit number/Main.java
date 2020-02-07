import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner scr = new Scanner(System.in);
    int n = scr.nextInt();
    int n1 = n%10;
    int n2 = n/10;
    int n3 = n2%10;
    int n4 = n/100;
    System.out.print(n1);
    System.out.print(n3);
    System.out.print(n4);
  }
}