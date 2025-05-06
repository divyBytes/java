
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement : ");
        String n = sc.nextLine();
        System.out.println("enter the no. of times to reapeat : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i = i+1){
            System.out.println(n);
        }
    }
}
