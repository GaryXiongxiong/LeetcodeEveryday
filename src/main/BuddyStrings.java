
import java.util.ArrayList;

/*
 * @Author: Gary J
 * @Date: 2019-09-27 19:39:43
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 15:07:15
 * @Description: https://leetcode.com/problems/buddy-strings/
 */
public class BuddyStrings{
    // Uneffcient Old Version
    // public boolean buddyStrings(String A,String B){
    //     StringBuilder sba = new StringBuilder(A);
    //     if(A.length()!=B.length()) return false;
    //     for(int i = 0;i<A.length()-1;i++){
    //         for(int j = i+1;j<A.length();j++){
    //             char alternate = sba.charAt(i);
    //             sba.setCharAt(i, sba.charAt(j));
    //             sba.setCharAt(j, alternate);
    //             if(sba.toString().equals(B)) return true;
    //             sba = new StringBuilder(A);
    //         }
    //     }
    //     return false;
    // }
    public boolean buddyStrings(String A,String B){
        if(A.length()!=B.length()||A.length() == 0) return false;
        if(A.equals(B)){
            if(A.chars().distinct().count()<A.length()) return true;
            else return false;
        }
        ArrayList<Character> Alist = new ArrayList<Character>();
        ArrayList<Character> Blist = new ArrayList<Character>();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=B.charAt(i)){
                Alist.add(A.charAt(i));
                Blist.add(0, B.charAt(i));
                if(Alist.size()>2) return false;
            }
        }
        if(Alist.equals(Blist)) return true;
        else return false;
    }
}
