package com.sunjin.dp.bubblesort.strategy;

/**
 * Created by jsun on 6/5/16.
 */
public class IntSortHandlerImpl implements SortHandler {

    private int[] array = null;

    @Override
    public int init(Object array) {
        this.array = (int[]) array;
        return this.array.length;
    }

    @Override
    public boolean compare(int index) {
        return array[index] > array[index + 1];
    }

    @Override
    public void swap(int index) {
        array[index] = array[index] + array[index + 1];
        array[index + 1] = array[index] - array[index + 1];
        array[index] = array[index] - array[index + 1];
    }
}
