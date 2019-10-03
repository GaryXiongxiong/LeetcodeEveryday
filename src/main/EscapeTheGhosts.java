/*
 * @Author: Yixiong J
 * @Date: 2019-10-03 20:50:00
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-03 21:05:22
 * @Description: https://leetcode.com/problems/escape-the-ghosts/
 */
public class EscapeTheGhosts {
    public boolean escapeGhosts(int[][] ghosts, int[] target){
        int distance = Math.abs(target[0])+Math.abs(target[1]);
        for(int[] ghost : ghosts){
            if(Math.abs(ghost[0]-target[0])+Math.abs(ghost[1]-target[1])<=distance) return false;
        }
        return true;
    }
}