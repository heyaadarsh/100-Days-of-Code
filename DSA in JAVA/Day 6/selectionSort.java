// Problem Link: https://www.codingninjas.com/studio/problems/selection-sort_624469

// Solution:
public class selectionSort {// Change class name to Solution in Coding ninjas Studio.
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
