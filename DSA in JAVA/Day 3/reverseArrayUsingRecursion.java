//Problem Link: https://www.codingninjas.com/studio/problems/reverse-an-array_8365444


// Solution: 49/50 test cases passed only

public class reverseArrayUsingRecursion { // Class will be Solution on Coding Ninjas Studio
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        reverse(nums, 0, n-1);

        return nums;

    }

    private static void reverse(int[] nums, int s, int e){
        if(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            reverse(nums, ++s, --e);
        }
    }
}
