package test.lessons.lesson6_sorting;

import codility.lessons.lesson6_sorting.Triangle;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleTest {
    private Triangle triangle;

    @BeforeClass
    public void init() {
        this.triangle = new Triangle();
    }

    @Test
    public void sample1Test() {
        int[] arr = {10, 2, 5, 1, 8, 20};
        int got = triangle.solution(arr);
        int answer = 1;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int[] arr = {10, 50, 5, 1};
        int got = triangle.solution(arr);
        int answer = 0;
        assertEquals(got, answer);
    }

}
