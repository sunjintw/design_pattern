package com.sunjin.dp.bubblesort.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jsun on 6/5/16.
 */
public class ReverseBubbleSorterTest {
    @Test
    public void sort() throws Exception {
        int[] sortArray = {5, 4, 2, 3, 8, 1, 9};
        SortHandler intSortHandler = new IntSortHandlerImpl();
        ReverseBubbleSorter reverseBubbleSorter = new ReverseBubbleSorter(intSortHandler);
        reverseBubbleSorter.sort(sortArray);
        assertArrayEquals(new int[]{9, 8, 5, 4, 3, 2, 1}, sortArray);
    }

}