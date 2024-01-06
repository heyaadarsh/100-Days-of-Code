// Link: https://www.codingninjas.com/studio/problems/bubble-sort_624380

// Solution:
public class bubbleSort { // Change class name to 'Solution' on coding ninjas studio
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
