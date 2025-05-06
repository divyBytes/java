public class numberhalfpryamid{
    public static void main(String[] args) {
        int n = 5;
        // for ( int i = 1; i <= n ; i++){
        //     for( int j = 1 ; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // // -> inverted halfpryamid of number
        // for  (int i = n ; i >= 1 ; i--){
        //     for ( int j = 1 ; j <= i ; j++){
        //     System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
        //->floyd's triangle
        // int p = 1;
        // for( int i = 1 ; i <= n ; i++){
        //     for ( int j = 1 ; j <= i ; j++){
        //         System.out.print(p+" ");
        //         p++;
        //     }
        //     System.out.println();
        // }
        //->0-1triangle
        for (int i = 1 ; i < n; i++) {
            for ( int j = 1 ; j <= i ; j++){
                if ((i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
            
        }


    }   


}