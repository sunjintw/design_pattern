package com.sunjin.dp.bubblesort;

/**
 * Created by jsun on 6/5/16.
 */
public class BubbleSorter {
    public static void sort(int[] array) {
        if (array.length > 1) {
            for (int nextToLast = array.length - 2; nextToLast > 0; nextToLast--) {
                for (int index = 0; index <= nextToLast; index++) {
                    compareAndSwap(array, index);
                }
            }
        }
    }

    private static void compareAndSwap(int[] array, int index) {
        if (array[index] > array[index + 1]) {
            swap(array, index);
        }
    }

    private static void swap(int[] array, int index) {
        array[index] = array[index] + array[index + 1];
        array[index + 1] = array[index] - array[index + 1];
        array[index] = array[index] - array[index + 1];
    }
}
