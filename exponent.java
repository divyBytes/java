
import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base value : ");
        int a = sc.nextInt();
        System.out.print("enetr the power : ");
        int b = sc.nextInt();
        double r = Math.pow(a,b);
        System.out.print("the value of "+a+"^"+b+" is : "+r);
    }
}
