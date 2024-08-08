import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int rows = 5;
        int cols = 6;
        int rStart = 1;
        int cStart = 4;

        int[][] expected = {
                {1, 4}, {1, 5}, {2, 5}, {2, 4}, {2, 3}, {1, 3}, {0, 3}, {0, 4}, {0, 5},
                {3, 5}, {3, 4}, {3, 3}, {3, 2}, {2, 2}, {1, 2}, {0, 2}, {4, 5}, {4, 4},
                {4, 3}, {4, 2}, {4, 1}, {3, 1}, {2, 1}, {1, 1}, {0, 1}, {4, 0}, {3, 0},
                {2, 0}, {1, 0}, {0, 0}
        };
        int[][] actual = new Solution().spiralMatrixIII(rows, cols, rStart, cStart);

        Assert.assertArrayEquals(expected, actual);
    }
}
