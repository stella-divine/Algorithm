package codility.lessons.lesson13_fibonacci_numbers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LadderTest {
    private Ladder ladder;

    @BeforeClass
    public void init() {
        this.ladder = new Ladder();
    }

    @Test
    public void sample1Test() {
        int[] A = {4, 4, 5, 5, 1};
        int[] B = {3, 2, 4, 3, 1};
        int[] actual = ladder.solution(A, B);
        int[] expected = {5, 1, 8, 0, 1};
        assertEquals(actual, expected);
    }

}
