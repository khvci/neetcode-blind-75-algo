package L01_ArraysAndHashingTests;

import org.example.L01_ArraysAndHashing.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicateReturnsTrue() {
        ContainsDuplicate dup = new ContainsDuplicate();
        int[] testInput = {1,2,2,3};
        assertTrue(dup.checkDuplicates(testInput));
    }

    @Test
    void containsDuplicateReturnsFalse() {
        ContainsDuplicate dup = new ContainsDuplicate();
        int[] testInput = {1,2,3,4};
        assertFalse(dup.checkDuplicates(testInput));
    }
}