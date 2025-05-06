
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Enter the name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("the name is "+name);
        System.out.println("Enter the address:");
        Scanner sd = new Scanner(System.in);
        String address = sd.nextLine();
        System.out.println("the address is "+address);
    }
}
