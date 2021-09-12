import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Integer[] a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")                    .split(" "))
            .map(Integer::parseInt)
            .collect(toList())
            .toArray(new Integer[0]);
            
        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++) {
                int left = a[j];
                int right = a[j+1];
                
                // Swap adjacent elements if they are in decreasing order
                if (left > right) {
                    a[j] = right;
                    a[j+1] = left;
                    
                    numberOfSwaps++;
                    totalSwaps++;
                }
            }
            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        bufferedReader.close();
        
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
