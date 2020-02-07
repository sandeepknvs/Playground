import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
 
 class Main {
 
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
            
        
       
        
        /*
         * Since the words are separated by space,
         * we will split the string by one or more space
         */
        
        String[] strWords = str.split("\\s+");
        
        //convert String array to LinkedHashSet to remove duplicates
        LinkedHashSet<String> lhSetWords 
            = new LinkedHashSet<String>( Arrays.asList(strWords) );
        
        //join the words again by space
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;
        
        for(String s : lhSetWords){
            
            if(index > 0)
                sbTemp.append(" ");
        
            sbTemp.append(s);
            index++;
        }
        
        str = sbTemp.toString();
        
        
        System.out.println(str);
 
    }
}