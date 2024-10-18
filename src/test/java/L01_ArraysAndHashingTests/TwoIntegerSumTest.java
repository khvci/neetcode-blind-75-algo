package L01_ArraysAndHashingTests;

import org.example.L01_ArraysAndHashing.TwoIntegerSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoIntegerSumTest {

    @Test
    public void testFindTwoSum_ValidPair() {
        TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
        assertArrayEquals(new int[] {0, 1}, twoIntegerSum.check(new int[] {3, 4, 5, 6}, 7));
        assertArrayEquals(new int[] {0, 2}, twoIntegerSum.check(new int[] {4, 5, 6}, 10));
        assertArrayEquals(new int[] {0, 1}, twoIntegerSum.check(new int[] {5, 5}, 10));
    }

    @Test
    public void testFindTwoSum_NegativeNumbers() {
        TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
        assertArrayEquals(new int[] {1, 2}, twoIntegerSum.check(new int[] {1, -2, 3}, 1));
    }

    @Test
    public void testFindTwoSum_LargeNumbers() {
        TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
        assertArrayEquals(new int[] {0, 1}, twoIntegerSum.check(new int[] {10000000, -10000000}, 0));
    }

    @Test
    public void testFindTwoSum_MinimumArrayLength() {
        TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
        assertArrayEquals(new int[] {0, 1}, twoIntegerSum.check(new int[] {2, 3}, 5));
    }
}