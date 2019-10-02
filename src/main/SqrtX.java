package main;

/*
 * @Author: Gary J
 * @Date: 2019-09-28 11:52:55
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 12:00:18
 * @Description: https://leetcode.com/problems/sqrtx/
 */
public class SqrtX{
    public int mySqrt(int x){
        if(x<=1) return x;
        int left = 0;
        int right = x/2+1;
        int mid = (left+right) >> 1;
        while(left<=right){
            mid = (left+right) >> 1;
            int divided = x/mid;
            if(divided>=mid){
                if(x/(mid+1)<(mid+1)) break;
                else{
                    left = mid+1;
                }
            }
            else if(divided<mid){
                right = mid-1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        SqrtX sx = new SqrtX();
        System.out.println(sx.mySqrt(9));
    }
}