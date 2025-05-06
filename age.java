
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("ADULT");
        }
        else{
            System.out.println("NOT ADULT");
        }
        }
    }

