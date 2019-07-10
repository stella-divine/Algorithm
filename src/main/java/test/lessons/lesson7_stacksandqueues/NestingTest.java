package test.lessons.lesson7_stacksandqueues;

import codility.lessons.lesson7_stacksandqueues.Nesting;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestingTest {
    private Nesting nesting;

    @BeforeClass
    public void init() {
        this.nesting = new Nesting();
    }

    @Test
    public void sample1Test() {
        String s = "(()(())())";
        int got = nesting.solution(s);
        int answer = 1;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        String s = "())";
        int got = nesting.solution(s);
        int answer = 0;
        assertEquals(got, answer);
    }

}
