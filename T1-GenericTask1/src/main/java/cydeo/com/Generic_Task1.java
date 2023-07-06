package cydeo.com;

import java.util.Arrays;

public class Generic_Task1 {

    //Write a generic method to exchange the positions of two different elements in array.
    //Integer[] a = {1,2,3,4};
    //swap(a,0,2);
    //System.out.println(Arrays.toString(a));
    // [3,2,1,4]
    //Sample output:
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(swap(arr, 0, 2)));
    }

    public static <T> T[] swap(T[] arr, int ps1, int ps2) {
        T temp = arr[ps1];
        arr[ps1] = arr[ps2];
        arr[ps2] = temp;
        return arr;
    }
}
