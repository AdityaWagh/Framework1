package aa.aa1.WebTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyTest {
    private int count;


    @Test
    public void test1() {
        count++;
        System.out.println("Test 1: count = " + count);
    }

    @Test
    public void test2() {
        count++;
        System.out.println("Test 2: count = " + count);
    }
}