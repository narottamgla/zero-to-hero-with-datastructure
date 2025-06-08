package org.datastructure.array;

import java.util.Arrays;

public class ZigzagSequence {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] zigzagArr = createZigzagSequence(arr, arr.length);
        System.out.print("Zigzag Sequence: ");
        for (int num : zigzagArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] createZigzagSequence(int[] a, int n) {
        Arrays.sort(a);
        int mid = (n - 1) / 2; // Corrected mid calculation for 0-based index
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
        int st = mid + 1;
        int ed = n - 2;
        while (st < ed) { // Use st < ed to avoid unnecessary swap when st == ed
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st++;
            ed--;
        }
        return a;
    }

}
