
import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();
        System.out.print("enter third number : ");
        int c = sc.nextInt();
        float avg = (a + b + c)/3;
        System.out.print("the average of the numbers is : "+avg);
    }
}
