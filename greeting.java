
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 3");
        int num = sc.nextInt();
        if(num == 1) {
            System.out.println("HELLO");
        } else if (num == 2) {
            System.out.println("RAM RAM JI");
        } else if (num == 3) {
            System.out.println("NAMASTE");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}
