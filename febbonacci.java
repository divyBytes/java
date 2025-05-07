
import java.util.Scanner;

public class febbonacci {
    public static void main(String[] args) {
        System.out.println("enter the number upto which you want the series : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = -1;
        int b = 1;
        System.out.print("the series is : ");
        for(int i = 0 ; i <= num ; i++){
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}
