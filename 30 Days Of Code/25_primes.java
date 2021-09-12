import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        while(num-- > 0){
            System.out.println(isPrime(sc.nextInt()));
        }
    }
    
    // Check for number prime or not
    public static String isPrime(int n) {
        if (n <= 1) return "Not prime";

        else if (n == 2) return "Prime";
 
        else if (n % 2 == 0) return "Not prime";
 
        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0) return "Not prime";
        }
        
        return "Prime";
    }
}
