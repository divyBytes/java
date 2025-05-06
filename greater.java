
import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr first number : ");
        int a = sc.nextInt();
        System.out.print("Enetr second number : ");
        int b = sc.nextInt();
        System.out.println("the greater among two numbers is : ");
        if(a>b){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }

    }
}
