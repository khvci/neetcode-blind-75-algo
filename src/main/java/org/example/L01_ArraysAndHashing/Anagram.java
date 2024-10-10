package org.example.L01_ArraysAndHashing;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // Create an array to count the frequency of each character
        int[] counts = new int[26];

        // Increment for each character in 's' and decrement for each character in 't'
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        // all counts should be 0 if strings are anagrams
        for (int i: counts) {
            if (i != 0) return false;
        }
        return true;
    }
}

/*
Is Anagram

Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true

Example 2:

Input: s = "jar", t = "jam"

Output: false

Constraints:

    s and t consist of lowercase English letters.

 */