import java.util.*;
public class Armstrong
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = in.nextInt();
         
        if(isarmstrong(n))
        {
            System.out.println(" "+n +" is an armstrong number");
        }
        else
        System.out.println(" "+n +" is not an armstrong number");
        
    }
    static boolean isarmstrong(int num)
    {
        int original = num;
        int sum = 0, rem, cube;
        while(num > 0)
        {
            rem = num % 10;
           
            cube = rem * rem * rem;
            sum = sum + cube;
            num = num / 10;
            
        }
        if(sum == original)
        {
            return true;
        }
        return false;
    }
}