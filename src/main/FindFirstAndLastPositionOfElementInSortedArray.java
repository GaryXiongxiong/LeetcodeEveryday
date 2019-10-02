package main;

/*
 * @Author: Gary J
 * @Date: 2019-09-27 15:41:49
 * @LastEditors: Gary J
 * @LastEditTime: 2019-09-27 19:59:32
 * @Description: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int mid = Arrays.binarySearch(nums, target);
        int[] notfound = { -1, -1 };
        if (mid < 0)
            return notfound;
        int first = 0;
        int last = nums.length;
        int mid1 = mid;
        int mid2 = mid;
        while (mid1 >= first) {
            int i = Arrays.binarySearch(nums, first, mid1, target);
            if (i >= 0)
                mid1 = i;
            else
                break;
        }
        while (mid2 <= last) {
            int i = Arrays.binarySearch(nums, mid2 + 1, last, target);
            if (i >= 0)
                mid2 = i;
            else
                break;
        }
        int[] found = { mid1, mid2 };
        return found;
    }

    // public static void main(String[] args) {
    //     FindFirstAndLastPositionOfElementInSortedArray ffalpoeisa = new FindFirstAndLastPositionOfElementInSortedArray();
    //     int[] nums = { 1,1,2 };
    //     int target = 1;
    //     int[] result = ffalpoeisa.searchRange(nums, target);
    //     System.out.println(Arrays.toString(result));
    // }
}