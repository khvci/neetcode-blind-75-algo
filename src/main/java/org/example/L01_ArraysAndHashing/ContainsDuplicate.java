package org.example.L01_ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean checkDuplicates(int[] nums) {
        HashSet<Integer> tempSet = new HashSet<>();
        for (int num : nums) {
            if (tempSet.contains(num)) {
                return true;
            }
            tempSet.add(num);
        }
        return false;
    }
}

/*
Duplicate Integer

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false

 */