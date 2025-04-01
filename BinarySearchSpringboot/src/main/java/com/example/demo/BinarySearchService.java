package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class BinarySearchService {

    public int binarySearch(int[] nums, int target) {
        
        HashMap<Integer,Integer>indexMapping = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            indexMapping.put(nums[i], i);
        }

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return indexMapping.get(nums[mid]);
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
}
