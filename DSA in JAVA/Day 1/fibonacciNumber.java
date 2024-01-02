import java.util.*;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postion: ");
        int n = sc.nextInt();

        int ans = fiboNum(n);
        System.out.println("The fibonacci number on the position " + n + " is : " + ans);
    }

    static int fiboNum(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fiboNum(n-1) + fiboNum(n-2);
    }
}
