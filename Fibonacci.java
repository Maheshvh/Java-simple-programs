import java.util.*;
public class Fibonacci
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        /*
        It gives number at the position
        int a = 0;
        int b = 1;
        int count = 2;
        int temp;
        while(count<n)
        {
            temp = b;
            b = b+a;
            a = temp;
            count++;   
        }
        System.out.println("Fibonacci of "+n +" is : "+b);
        */
        //This program provides complete fibonacci series
        int count = 0;
        int a = 0;
        int b = 1;
        int temp;
        while(count<n)
        {
            temp = a;
            System.out.println(a);
            a = b+a;
            b = temp;
            
            count++;
        }
    }
}