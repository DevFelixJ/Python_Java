import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int B,H;
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B>=0 && B<100 && H>=0 && H<100){
            System.out.println(B*H);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}