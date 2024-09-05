import java.util.*;
public class Reversestring {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a string to be reversed : ");
        String str = read.next();
        //Approach 1 
        StringBuilder sb  = new StringBuilder(str) ;
        for(int i = 0; i < sb.length()/2; i++)
        {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println("Reversed String : "+sb);
        //Approach 2
        for(int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
        //Approach 3
        System.out.println(sb.reverse());
    } 
}
