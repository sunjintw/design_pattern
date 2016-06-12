package com.sunjin.dp.bubblesort.strategy;

/**
 * Created by jsun on 6/5/16.
 */
public class ReverseBubbleSorter {
    private SortHandler sortHandler = null;

    public ReverseBubbleSorter(SortHandler sortHandler) {
        this.sortHandler = sortHandler;
    }

    public void sort(Object array) {
        int length = sortHandler.init(array);
        if (length > 1) {
            for (int nextToLast = length - 2; nextToLast > -1; nextToLast--) {
                for (int index = 0; index <= nextToLast; index++) {
                    if (!sortHandler.compare(index)) {
                        sortHandler.swap(index);
                    }
                }
            }
        }
    }
}
