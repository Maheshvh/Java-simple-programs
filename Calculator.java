import java.util.*;
public class Calculator
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x or X to exit the operation ");
        int ans = 0;
        while(true)
        {
            System.out.print("Enter operator : ");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.println("Enter two numbers : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(op == '+')
                {
                    ans = num1 + num2;
                }
                if(op == '-')
                {
                    ans = num1 - num2;
                }
                if(op == '*')
                {
                    ans = num1 * num2;
                }
                if(op == '/')
                {
                    if(num2 != 0)
                     ans = num1 + num2;
                }
                if(op == '%')
                {
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid operator!!");
            }
            System.out.println("Answer is : "+ans);

        }
    }
}