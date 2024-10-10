package org.example.L01_ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void racecarAndCarraceReturnsTrue() {
        Anagram anagram = new Anagram();
        String[] testInput = {"racecar", "carrace"};
        assertTrue(anagram.isAnagram(testInput[0], testInput[1]));
    }

    @Test
    void jarAndJamReturnsFalse() {
        Anagram anagram = new Anagram();
        String[] testInput = {"jar", "jam"};
        assertFalse(anagram.isAnagram(testInput[0], testInput[1]));
    }
}