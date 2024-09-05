import java.util.*;
public class CheckPermutation {
    public static boolean testPermutation(String str1, String str2)
    {
        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();
        if(x.length != y.length)
        {
            return false;
        }
        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str1 = read.nextLine();
        System.out.println("Enter string 2 : ");
        String str2  = read.nextLine();
        System.out.println("Permutation is : "+testPermutation(str1,str2));
    }
}