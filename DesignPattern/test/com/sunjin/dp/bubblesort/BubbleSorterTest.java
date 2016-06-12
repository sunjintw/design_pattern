package com.sunjin.dp.bubblesort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by jsun on 6/5/16.
 */
public class BubbleSorterTest {

    @Test
    public void testSort() {
        int[] sortArray = {5, 4, 2, 3, 8, 1, 9};
        BubbleSorter.sort(sortArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 8, 9}, sortArray);
    }

}