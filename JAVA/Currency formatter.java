import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat f1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat f2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat f3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = f1.format(payment);
        String india = f2.format(payment);
        String china = f3.format(payment);
        String france = f4.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}