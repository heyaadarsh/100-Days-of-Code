import  java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-58, -9, 0, 0, 10, 36, 63, 74, 86, 102};

        // binary search only works for sorted array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();

        int pos = binarySearch(arr, key, 0, arr.length-1);

        System.out.println("Position of the number in the array is: " + pos);

    }

    static int binarySearch(int[] arr, int key, int start, int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end-start) / 2;

        if(arr[mid]==key){
            return mid;
        }

        if(arr[mid]>key){
            return binarySearch(arr, key, start, mid-1);
        }

        return binarySearch(arr, key, mid+1, end);
    }
}
