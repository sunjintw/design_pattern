package com.sunjin.dp.bubblesort.template;

/**
 * Created by jsun on 6/5/16.
 */
public class IntBubbleSorter extends BubbleSorter {

    private int[] array = null;

    @Override
    protected int init(Object array) {
        this.array = (int[]) array;
        return this.array.length;
    }

    @Override
    protected boolean compare(int index) {
        return array[index] > array[index + 1];
    }

    @Override
    protected void swap(int index) {
        array[index] = array[index] + array[index + 1];
        array[index + 1] = array[index] - array[index + 1];
        array[index] = array[index] - array[index + 1];
    }
}
