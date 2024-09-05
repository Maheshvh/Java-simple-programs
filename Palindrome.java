import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = in.next();
        word = word.toLowerCase();
        if(ispalindrome(word))
        {
            System.out.println(" "+word +" is a palindrome");
        }
        else
        {
            System.out.println(" "+word +" is not a palindrome");
        }
    }
    static boolean ispalindrome(String str)
    {
        int i = 0, j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}
