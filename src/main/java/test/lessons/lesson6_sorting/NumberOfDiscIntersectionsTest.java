package test.lessons.lesson6_sorting;

import codility.lessons.lesson6_sorting.NumberOfDiscIntersections;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberOfDiscIntersectionsTest {
    private NumberOfDiscIntersections numberOfDiscIntersections;

    @BeforeClass
    public void init() {
        this.numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @Test
    public void sample1Test() {
        int[] arr = {1, 5, 2, 1, 4, 0};
        int got = numberOfDiscIntersections.solution(arr);
        int answer = 11;
        assertEquals(got, answer);
    }

}
