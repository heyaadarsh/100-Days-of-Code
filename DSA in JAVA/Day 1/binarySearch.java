import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-6, 0, 18, 29, 34, 56, 89};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find: ");
        int key = sc.nextInt();

        int res = search(arr, key, 0, arr.length-1);

        System.out.println("Number " + key + " is on position " + res);
    }

    static int search(int[] arr, int key, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start) / 2;

        if(arr[mid]==key){
            return mid;
        }

        if(arr[mid]>key){
            return search(arr, key, start, mid-1);
        }

        return search(arr, key, mid+1, end);
    }
}
