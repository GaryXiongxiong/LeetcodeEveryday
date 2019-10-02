
/*
 * @Author: Gary J
 * @Date: 2019-09-26 11:41:14
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 15:05:49
 * @Description: https://leetcode.com/problems/verifying-an-alien-dictionary/
 */
public class VerifyingAnAlienDictionary{
    public boolean isAlienSorted(String[] words, String order) {
        for(int i =0;i<words.length-1;i++){
            if (!isFormer(words[i], words[i+1], order)){
                return false;
            }
        }
        return true;
    }
    public boolean isFormer(String former, String later, String order){
        for(int i =0;i<Math.max(former.length(),later.length());i++){
            if(i>=later.length()){
                return false;
            }
            if(i>=former.length()){
                return true;
            }
            int formerRank = order.indexOf(former.charAt(i));
            int laterRank = order.indexOf(later.charAt(i));
            if(formerRank>laterRank){
                return false;
            }
            if(formerRank<laterRank){
                return true;
            }
        }
        return true;
    }
}