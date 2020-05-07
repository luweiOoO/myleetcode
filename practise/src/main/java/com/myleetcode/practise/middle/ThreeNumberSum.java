package com.myleetcode.practise.middle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeNumberSum {

    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int l = i + 1, r = nums.length - 1,sum = 0 - nums[i];
                while(l < r){
                    if(nums[l] + nums[r] == sum){
                        result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while(l < r && nums[l] == nums[l + 1]) l++;
                        while(l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    }else if(nums[l] + nums[r] < sum){
                        while(l < r && nums[l] == nums[l + 1]) l++;
                        l++;
                    }else{
                        while(l < r && nums[r] == nums[r - 1]) r--;
                        r--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
}
