package com.sunjin.dp.bubblesort.strategy;

/**
 * Created by jsun on 6/5/16.
 */
public interface SortHandler {

    int init(Object array);

    boolean compare(int index);

    void swap(int index);
}
