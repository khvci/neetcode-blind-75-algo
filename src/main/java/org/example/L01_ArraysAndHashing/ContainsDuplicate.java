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
