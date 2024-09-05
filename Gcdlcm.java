import java.util.*;
public class Gcdlcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two elements : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int ogn1 = n1;
        int ogn2 = n2;
        while(n1 % n2 != 0)
        {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int hcf = n2;
        int lcm = (ogn1 * ogn2)/gcd;
        System.out.println(hcf);
        System.out.println(lcm);

    }
}
