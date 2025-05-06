
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("the table of "+num);
         // for(int i = 1 ; i < 11 ; i = i+1){
        //     System.out.println(num*i);
        //}
        
        int i =1;
        while(i < 11){
            System.out.println(num * i);
            i = i + 1;
        }
           
    }
}
