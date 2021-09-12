import java.util.*;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    public void printArray(Object[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}