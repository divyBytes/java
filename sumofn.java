
import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value upto which you want sum : ");
        int n = sc.nextInt();
        int sum = 0 ;
        for (int i = 1 ; i <= n ; i++){
            sum = sum + i ;
        }
        System.out.println("The sum is "+sum);
    }
}

