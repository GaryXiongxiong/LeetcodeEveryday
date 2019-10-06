import java.util.Arrays;

/*
 * @Author: Yixiong J
 * @Date: 2019-10-06 21:47:23
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-06 22:13:46
 * @Description: https://leetcode.com/problems/valid-boomerang/
 */
public class ValidBoomerang {
    public boolean isBoomerang(int[][] points){
        int[] a = points[0];
        int[] b = points[1];
        int[] c = points[2];
        if(Arrays.equals(a, b)||Arrays.equals(a, c)||Arrays.equals(c, b)) return false;
        if(a[0]==b[0]&&a[0]==c[0]) return false;
        double slope = (double)(a[1]-b[1])/(double)(a[0]-b[0]);
        double motion = (double)a[1]-(double)a[0]*slope;
        if(c[1] == c[0]*slope+motion){
            return false;
        }
        else{
            return true;
        }
    }
}