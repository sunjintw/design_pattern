package com.sunjin.dp.bubblesort.template;


/**
 * Created by jsun on 6/5/16.
 */
public abstract class BubbleSorter {

    public void sort(Object array) {
        int length = init(array);
        if (length > 1) {
            for (int nextToLast = length - 2; nextToLast > 0; nextToLast--) {
                for (int index = 0; index <= nextToLast; index++) {
                    if (compare(index)) {
                        swap(index);
                    }
                }
            }
        }
    }

    protected abstract int init(Object array);

    protected abstract boolean compare(int index);

    protected abstract void swap(int index);
}
