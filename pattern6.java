import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int p = (n + 1) / 2;
        for(int i = 0 ; i < p ; i++){
            if(i == p - 1){
                for(int j = 1; j <= n; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 1; j <= n; j++){
                    if((j == p - i) || (j == p + i)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");     
                    }
                }
            }
            System.out.println();
            }
        }

    }

