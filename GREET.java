
import java.util.Scanner;

public class GREET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter a number from 1 to 3");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("HELLO JI");
                break;
            case 2:
                System.out.println("RAM RAM JI");
                break;
            case 3:
                System.out.println("NAMASTE JI");
                break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
}
