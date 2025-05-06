
import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a : ");
        int a = sc.nextInt();
        System.out.print("enter value of b : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum is : "+sum);
    }
}
