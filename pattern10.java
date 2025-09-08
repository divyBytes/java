

public class pattern10 {
    public static void main(String[] args) {
        int n = 4;
        //for outer columns
        for(int i = 1; i <= n; i++){
            // for inner 1st part stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //for innner spaces
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            // for innner 2nd part stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            // for inner 1st part stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //for innner spaces
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            // for innner 2nd part stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
