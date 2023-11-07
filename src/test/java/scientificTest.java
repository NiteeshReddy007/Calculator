import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class scientificTest {
    private Main uncalculator;
    @Before
    public void setUp() {
        uncalculator = new Main();
    }
    @Test
    public void test_add() {
        int a = 5;
        int a1 = 2;
        int expectedResult = 7;
        int result = uncalculator.add(a,a1);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_subt() {
        int a = 2;
        int a1 = 1;
        int expectedResult = 1;
        int result = uncalculator.subt(a,a1);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_mul() {
        int a = 4;
        int a1 = 2;
        int expectedResult = 8;
        int result = uncalculator.mul(a,a1);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_div() {
        int a = 2;
        int a1 = 5;
        int expectedResult = 2;
        int result = uncalculator.div(a,a1);
        Assert.assertEquals(expectedResult, result);
    }
}