import java.util.*;
public class RemoveSpecialChar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = read.next();
        String resultstr = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>65 && str.charAt(i) <= 121)
            {
                resultstr = resultstr + str.charAt(i); 
            }
        }   
        System.out.println(resultstr);
    }
}