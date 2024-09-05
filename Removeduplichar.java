import java.util.*;
public class Removeduplichar
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = read.nextLine();
        StringBuilder sb = new StringBuilder();
        if(str.length() != 0)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            sb.append(ch[0]);
            for (int i = 1; i < ch.length; i++) {
                if(ch[i] != ch[i-1])
                {
                    sb.append(ch[i]);
                }
            }
        }
        
        System.out.println(sb);
    }
}