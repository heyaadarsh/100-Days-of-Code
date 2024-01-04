//Problem Link: https://www.codingninjas.com/studio/problems/sum-of-first-n-numbers_8876068


// Solution: 49/50 test cases passed only

public class sumOfFirstN_Numbers { // Class will be Solution on Coding Ninjas Studio
    public static long sumFirstN(long n) {
        // Write your code here.

        long sum = n;

        if(n<1){
            return 0;
        }

        return sum + sumFirstN(n-1);
    }
}
