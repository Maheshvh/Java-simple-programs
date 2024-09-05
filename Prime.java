import java.util.*;
public class Prime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        boolean ans = isprime(n);
        if(ans == true)
        {
            System.out.println(" "+n +" is not prime number.");
        }
        else
            System.out.println(""+n +" is a prime number.");
    }
    static boolean isprime (int num)
    {
        int c = 2;
        while(c * c <= num)
        {
            if(num%c == 0)
            {
                return true;
            }
            c++;
        }
        return false;
    }
}