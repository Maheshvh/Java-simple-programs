import java.util.*;
public class Union {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter size of array 1");
        int n1 = read.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter size of array 2");
        int n2 = read.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter elements of array 1 ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = read.nextInt();
        }
        System.out.println("Enter elements of array 2 ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = read.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++) {
            set.add(arr2[i]);
        }
        System.out.println("Union Contains : "+set.size()+" elements");
        System.out.println(set);
    }
    
}
