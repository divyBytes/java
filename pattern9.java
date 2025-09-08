//required outpuut 
//  1 2 3 4
//   2 3 4
//    3 4
//     4


// public class pattern9 {
//     public static void main(String[] args) {
//         int n = 1;
//         for(int i = 1; i <= 4; i++){
//             for(int j = 1; j <= 7; j++){
//                 if(i == 1){
//                     int num = i + j;
//                     if(num % 2 == 0){
//                         System.out.print(n);
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }
//                 else if(i == 2){
//                     if((i + j == 4) || (i + j == 6) || (i + j == 8)){
//                         System.out.print(n);
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }
//                 else if(i == 3){
//                     if((i + j == 6) || (i + j == 8)){
//                         System.out.print(n);
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }
//                 else if(i == 4){
//                     if((i + j == 8)){
//                         System.out.print(n);
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             n++;
//         System.out.println();
//     }
// }
// }


public class pattern9{
    public static void main(String[] args) {
        int n = 4;
        //for outer loop
        for(int i = 1; i <= n; i++){
            //for spaces
            for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            //for number
            for(int j = i; j <= n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}