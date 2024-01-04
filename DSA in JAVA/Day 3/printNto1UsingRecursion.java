//Problem Link: https://www.codingninjas.com/studio/problems/n-to-1-without-loop_8357243


// Solution:
public class printNto1UsingRecursion { // Class will be Solution on Coding Ninjas Studio
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr = new int[x];
        addToArray(arr, x, 0);

        return arr;
    }

    private static void addToArray(int[] arr, int x, int index){
        if(x>=1){
            arr[index] = x;
            addToArray(arr, x-1, index+1);
        }
    }
}
