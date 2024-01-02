import java.util.*;

public class fibonacciNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int n = sc.nextInt();

        int res = fiboNum(n);

        System.out.println("The fibonacci number at position " + n + " is: " + res);

    }

    static int fiboNum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int ans = fiboNum(n-1) + fiboNum(n-2);
        return ans;
    }
}
