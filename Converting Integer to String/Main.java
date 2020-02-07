import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int str_len = str.length();
        int n = 0;
        int idx = 0;
        if(str_len == 4)
             idx = 1;

        while(idx < str_len)
        {
            if((str.charAt(idx) >= 48) && (str.charAt(idx) <= 57))
            {
                n = (n * 10) + (str.charAt(idx) - 48);
                idx++;
            }
        }
        if(str_len == 4)
            System.out.print("-"+n);
        else
            System.out.print(n);
    }
}
