package test.lessons.lesson5_prefixsums;

import codility.lessons.lesson5_prefixsums.MinAvgTwoSlice;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice minAvgTwoSlice;

    @BeforeClass
    public void init() {
        this.minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @Test
    public void sample1Test() {
        int[] arr = {4, 2, 2, 5, 1, 5, 8};

        int got = minAvgTwoSlice.solution(arr);
        int answer = 1;

        assertEquals(got, answer);
    }

}
