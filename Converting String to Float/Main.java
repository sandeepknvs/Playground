import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int str_len = str.length();
        Float f= new Float(str);
        float dexp = f;
       // System.out.printf("%6f\n", dexp);
        if(str_len == 5)
        {
            System.out.printf(str+"00000");
        }
        else if(str_len == 3)
        {
            System.out.printf(str+".000000");
        }
      else if(str_len == 6)
      {
        System.out.printf(str+"0000");
      }
    }
}
