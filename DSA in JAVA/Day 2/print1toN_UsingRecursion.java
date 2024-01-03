// Problem Link: https://www.codingninjas.com/studio/problems/print-1-to-n_628290


// Solution:
public class print1toN_UsingRecursion { // Class name will be 'Solution' on coding ninjas studio
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        addToArray(x, 1, arr);
        return arr;
    }

    private static void addToArray(int x, int index, int[] arr){
        if(index<=x){
            arr[index-1] = index;
            addToArray(x, index+1, arr);
        }


    }
}
