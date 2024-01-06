// Problem link: https://www.codingninjas.com/studio/problems/count-frequency-in-a-range_8365446

// Solution: 
import java.util.*;
public class countFrequencyInRange { // Change class name to 'Solution' on coding ninjas studio
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.

        int[] res = new int[n];

        for(int i = 0; i<n; i++){
            if(nums[i]<=n){
                res[nums[i]-1]++;
            }
        }

        return res;
    }
}
