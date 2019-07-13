package test.lessons.lesson12_euclidean_algorithm;

import codility.lessons.lesson12_euclidean_algorithm.CommonPrimeDivisors;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CommonPrimeDivisorsTest {
    private CommonPrimeDivisors commonPrimeDivisors;

    @BeforeClass
    public void init() {
        this.commonPrimeDivisors = new CommonPrimeDivisors();
    }

    @Test
    public void sample1Test() {
        int[] A = {15, 10, 9};
        int[] B = {75, 30, 5};
        int got = commonPrimeDivisors.solution(A, B);
        int answer = 1;
        assertEquals(got, answer);
    }

}
