package com.rchab.leetcode;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class SumTwo {

    public static void main(String[] args){
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[]ind = twoSum(nums, target);
        System.out.println(ind[0]);
        System.out.println(ind[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int in1 = 0;
        int in2 = 0;
        boolean notFound = true;
        int j = 0;
        int length = nums.length;
        while (notFound || j == length) {
            for (int i = 0; i < length; i++) {
                if (i != j) {
                    int firstElement = nums[j];
                    int secondElement = nums[i];
                    int sum = firstElement + secondElement;
                    if(sum == target){
                        in1 = j;
                        in2 = i;
                        notFound = false;
                    }
                }
            }
            j++;
        }
        return new int[]{in1, in2};
    }

}
