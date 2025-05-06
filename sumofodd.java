
import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the last number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ;){
            sum = sum + i ; 
            i = i + 2;
        }
        System.out.print("the sum of odd numbers upto n is : "+sum);
        
    }
}
