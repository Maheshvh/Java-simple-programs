//incomplete
import java.util.*;
public class Majority
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter nor of elements");
        int n = read.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            nums[i] = read.nextInt();
        }

        HashMap<Integer, Integer> ma = new HashMap<>();
        System.out.println("Hi");
        for (int i = 0; i < n; i++) {
            if(ma.containsKey(nums[i]))
            {
                ma.put(nums[i], ma.get(nums[i] + 1));
                if(ma.get(nums[i]) > n/3)
                {
                    System.out.println();
                }
            }
            else
            {
                ma.put(nums[i], 1);
            }
            

        }
        System.out.println("hlo");
        
    }
}