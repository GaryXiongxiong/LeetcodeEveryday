/*
 * @Author: Gary J
 * @Date: 2019-09-22 21:26:07
 * @LastEditors: Gary J
 * @LastEditTime: 2019-09-26 20:19:26
 * @Description: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 */

public class MinimumMovesToEqualArrayElements {
    // TIMEOUT
    // public int minMoves(int[] nums){
    //     int count = 0;
    //     while(true){
    //         Arrays.sort(nums);
    //         boolean allEqual = true;
    //         for (int num : nums) {
    //             if(num!=nums[0]) allEqual = false;
    //         }
    //         if(allEqual) return count;
    //         for(int i=0; i<nums.length-1;i++){
    //             nums[i]++;
    //         }
    //         count++;
    //     }
        
    // }
        //将所有数值减小到最小值
        //n-1个数+1 与 1个数-1 等效
        // 只需计算需要将各个数各-1多少次
        public int minMoves(int[] nums) {
            int min = Integer.MAX_VALUE, count = 0;
            for(int n : nums) {
                min = Math.min(min, n);
            }
            for(int n : nums) {
                count += n - min;
            }
            return count;
        }
    // public static void main(String[] args) {
    //     MinimumMovesToEqualArrayElements mmteae = new MinimumMovesToEqualArrayElements();
    //     int[] nums = {1,2147483647};
    //     System.out.println(mmteae.minMoves(nums));
    // }
}