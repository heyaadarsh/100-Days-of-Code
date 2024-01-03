// Problem Link: https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720

import java.util.Scanner;

public class sumOfAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int ans = sumDiv(n);
        System.out.println("The required sum is: " + ans);
    }

    public static int sumDiv(int n){
        int sum = 0;


        //Approach:1
        // for(int j = 1; j<=n; j++){
        //     for (int i = 1; i<=j; i++){
        //         if(j%i==0){
        //             sum += i;
        //         }
        //     }
        // }



        //Approach:2
        // for(int j = 1; j<=n; j++){
        //     for(int i = 1; i<=(int)Math.sqrt(j); i++){
        //         if(j%i==0){
        //             sum+=i;
        //             if(i!=j/i){
        //                 sum+=(j/i);
        //             }
        //         }
        //     }
        // }


        //Approach:3
        // for(int i = 1; i<=n; i++){
        //     sum +=(n/i)*i;
        // }


        //Approach:4
        for(int i =1; i<=n; i++){
            for(int j = 1; j*j<=i; j++){
                if(i%j==0){
                    if(j==i/j){
                        sum += j;
                    }
                    else{
                        sum += j + (i/j);
                    }
                }
            }
        }

        return sum;
    }
}
