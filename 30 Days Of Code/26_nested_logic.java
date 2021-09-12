import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();
        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();
        
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day1;
        if (date1 < date2) {
            System.out.println("0");
            return;
        }
        
        if (year1 > year2) {
            System.out.println("10000");
        }
        else if (month1 > month2) {
            System.out.println(500 * (month1 - month2));
        }
        else if (day1 > day2) {
            System.out.println(15 * (day1 - day2));
        }
    }
}
