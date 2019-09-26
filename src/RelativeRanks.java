/*
 * @Author: Gary J
 * @Date: 2019-09-21 15:33:58
 * @LastEditors: Gary J
 * @LastEditTime: 2019-09-25 23:51:05
 * @Description: https://leetcode.com/problems/relative-ranks/
 */
import java.util.Arrays;
public class RelativeRanks{
    public String[] findRelativeRanks(int[] nums){
        int[] numsOrdered = nums.clone();
        Arrays.sort(numsOrdered);
        int length = nums.length;
        String[] ranking = new String[length];
        for(int i = 0;i<length;i++){
            int rank = Arrays.binarySearch(numsOrdered, nums[i]);
            if(rank == length-1){
                ranking[i] = "Gold Medal";
            }
            else if(rank == length-2){
                ranking[i] = "Silver Medal";
            }
            else if(rank == length-3){
                ranking[i] = "Bronze Medal";
            }
            else{
                ranking[i] = String.valueOf(length - rank);
            }
        }
        return ranking;
    }
    // public static void main(String[] args) {
    //     RelativeRanks rr = new RelativeRanks();
    //     int[] nums = {1,2,3,4,5};
    //     String[] returns = rr.findRelativeRanks(nums);
    //     System.out.println("done");
    // }
}