package com.sunjin.dp.bubblesort.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jsun on 6/5/16.
 */
public class IntBubbleSorterTest {
    @Test
    public void sort() throws Exception {
        int[] sortArray = {5, 4, 2, 3, 8, 1, 9};
        BubbleSorter bubbleSorter = new IntBubbleSorter();
        bubbleSorter.sort(sortArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 8, 9}, sortArray);
    }

}