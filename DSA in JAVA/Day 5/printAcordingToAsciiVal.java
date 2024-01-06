// Write a program, which takes input as a string, it check the ascii value of the character and if it is even then it replaces with its next ascii value and previous in case of odd. (Day 5)

// Solution:
import java.util.*;
public class printAcordingToAsciiVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder str = new StringBuilder();
        int n = s.length();

        for(int i =  0; i<n; i++){
            int x = s.charAt(i);
            if(x%2==0){
                Character a = (char)(x-1);
                str.append(a);
            }
            else{
                Character b = (char)(x+1);
                str.append(b);
            }
        }

        System.out.println(str);
    }
}
