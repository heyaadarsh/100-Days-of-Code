// Question Link: https://www.codingninjas.com/studio/problems/check-prime_624934


// Solution:
public class primeNumbers { // Class name will be 'Solution' on coding ninjas studio
    public static String isPrime(int num) {

        if(num<=1){
            return "NO";
        }

        int count = 0;
        for(int i = 2; i*i<=num; i++){
            if(num%i==0){
                count++;
            }
        }

        if(count>0){
            return "NO";
        }


        return "YES";

    }
}