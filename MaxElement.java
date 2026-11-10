//find the maximum element from the given array-------------------------------------
package Arrays;

import java.util.Arrays;

public class MaxElement {
    static void main(String[] args) {

        int[] a = {10, 15, 20, 5, 46, 23};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}




