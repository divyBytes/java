public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if((i == 1 || i == 5) && (i + j == 4 || i + j == 8))
                    System.out.print("*");
                else if((i == 2 || i == 4) && (i + j == 4 || i + j == 6 || i + j == 8))
                    System.out.print("*");
                else if ((i == 3) && (i + j == 4 || i + j == 6 || i + j == 8))
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
    //     int n = 3;
    //     //outer loop
    //     for(int i = 1; i <= n; i++){
    //         // for spaces
    //         for(int j = 1; j < n-i; j++){
    //             System.out.print(" ");
    //         }
    //         //for stars
    //         for(int j = 1; j < i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     //reverse the pattern
    //     for(int i = 1; i < n; i++){
    //     //for spaces
    //      for(int j = 1; j <= i-1; j++){
    //         System.out.print(" ");
    //      }
    //      for(int j = 1; j <= n; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //     }
        
    // }
    // }

