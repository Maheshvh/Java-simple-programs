import java.util.*;
public class IsUnique {
    static boolean testunique(String str)
    {
        char[] chars = str.toUpperCase().toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(int c = 0; c <= chars.length - 1; c++)
        {
            if(!set.add(str.charAt(c)))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = read.nextLine();
        System.out.println(""+testunique(str));
    }
}
