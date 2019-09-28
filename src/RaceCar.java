/*
 * @Author: Gary J
 * @Date: 2019-09-28 01:19:57
 * @LastEditors: Gary J
 * @LastEditTime: 2019-09-28 01:54:11
 * @Description: https://leetcode.com/problems/race-car/
 */
public class RaceCar{
    public int racecar(int target){
        int[] dp = new int[target+1];
        dp[0]=0;
        for(int i =1;i<target+1;i++){
            int ins1 = 0;
            for(;distance(ins1)<i;ins1++){}
            if(distance(ins1)==i){
                dp[i]=ins1;
                continue;
            }
            dp[i] = ins1+1+dp[distance(ins1)-i];
            for(int ins2 =0;ins2<ins1-1;ins2++){
                dp[i] = Math.min(dp[i], ins1+ins2+1+dp[i-distance(ins1-1)+distance(ins2)]);
            }

        }
        return dp[target];
    }
    int distance(int k){
        return (1<<k)-1;
    }
    public static void main(String[] args) {
        RaceCar rc = new RaceCar();
        int target = 10;
        int result = rc.racecar(target);
        System.out.println(result);
    }
}