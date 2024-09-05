import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = read.next();
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str)
    {
        str = str.toLowerCase();
        if(str.length() == 0)
        {
            return true;
        }
        for(int i = 0; i < str.length() / 2; i++)
        {
            int start = i;
            int end = str.length() - 1 - i;
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
        }
        return true;
    }
}
