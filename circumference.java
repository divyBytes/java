
import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose for which shape you want to find circumference : ");
        System.out.println("1 for rectangle");
        System.out.println("2 for square");
        System.out.println("3 for circle");
        System.out.println("4 for triangle");
        System.out.print("enter your choice : ");
        int ch = sc.nextInt();
        switch(ch){
            case 1 : 
                System.out.println("for circumference of rectangle");
                System.out.println("enter length and breadth");
                int l = sc.nextInt();
                int b = sc.nextInt();
                int cir1 = 2*(l + b);
                System.out.print("the circumference of rectangle is : "+cir1);
                break;

            case 2 : 
                System.out.println("for circumference of square");
                System.out.print("enter side of square : ");
                int s = sc.nextInt();
                int cir2 = 4*s;
                System.out.print("the circumference of square is : "+cir2);
                break;

            case 3 : 
                System.out.println("for circumference of circle");
                System.out.print("enter the radius : ");
                double r = sc.nextDouble();
                double cir3 = 2*3.14*r;
                System.out.print("the circumference of circle is : "+cir3);
                break;

            case 4 : 
                System.out.println("for circumference of triangle");
                System.out.println("enter all three sides of triangle");
                int l1 = sc.nextInt();
                int l2 = sc.nextInt();
                int l3 = sc.nextInt();
                int cir4 = l1 + l2 + l3;
                System.out.print("the circumference of triangle is : "+cir4);
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
