package com.georgetudor;

import java.util.HashMap;
import java.util.Map;

public class Solution {
//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i <= nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int complement = target - nums[i];
//                if (nums[j] == complement) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        throw new IllegalArgumentException("no match found");
//    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();

        for(int i =0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(num_map.containsKey(complement)) {
                return new int[] {num_map.get(complement), i};
            }
            num_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found");
    }

    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0) {
            return false;
        }
        String stringVar = String.valueOf(x);
        int startOfString = 0;
        int endOfString = stringVar.length() -1;
        while(startOfString <= endOfString ) {
            if (stringVar.charAt(startOfString) != stringVar.charAt(endOfString)) {
                return false;
            }
            startOfString++;
            endOfString--;
        }
        return true;
    }

}
