package tuf.common;

import java.util.Arrays;

public class HeapAlgo {
    // Prints the array
    void printArr(int a[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
 
    // Generating permutation using Heap Algorithm
    void heapPermutation(int a[], int size, int n)
    {
        // if size becomes 1 then prints the obtained
        // permutation
    	  System.out.println("heap-------------------");
        if (size == 1)
            printArr(a, n);
 
        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);
 
            // if size is odd, swap 0th i.e (first) and
            // (size-1)th i.e (last) element
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
                System.out.println( "size is odd "+size +"-"+Arrays.toString(a));
            }
 
            // If size is even, swap ith
            // and (size-1)th i.e last element
            else {
                int temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
                System.out.println( "size is even "+size +"-"+Arrays.toString(a));
            }
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        HeapAlgo obj = new HeapAlgo();
        int a[] = { 1, 2, 3 };
        obj.heapPermutation(a, a.length, a.length);
    }
}