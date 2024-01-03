// Problem Link: https://www.codingninjas.com/studio/problems/-print-n-times_8380707

import java.util.List;
import java.util.ArrayList;

public class printNameN_Times { // Class name will be 'Solution' on coding ninjas studio
    public static List<String> printNtimes(int n){
        // Write your code here.
        List<String> print = new ArrayList<>();

        addToArray(n, print);

        return print;

    }

    private static void addToArray(int n, List<String> print){
        if(n>0){
            print.add("Coding Ninjas");
            addToArray(n-1, print);
        }
    }
}
