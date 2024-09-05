import java.util.*;
public class Casecheck {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = input.next().trim().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println("You have entered lower case letter.");
        }
        else{
            System.out.println("You have entered upper case letter.");
        }
    }
    
}
