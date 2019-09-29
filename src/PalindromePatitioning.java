/*
 * @Author: Gary J
 * @Date: 2019-09-28 13:19:20
 * @LastEditors: Gary J
 * @LastEditTime: 2019-09-29 15:03:54
 * @Description: https://leetcode.com/problems/palindrome-partitioning/
 */
import java.util.ArrayList;
import java.util.List;

public class PalindromePatitioning{

    public List<List<String>> partition(String s){
        ArrayList<List<String>> list = new ArrayList<List<String>>();
        if(isPalindrome(s)){
            ArrayList<String> p = new ArrayList<String>();
            p.add(s);
            list.add(p);
        }
        for(int i =1;i<s.length();i++){
            List<List<String>> left = partition(s.substring(0, i));
            List<List<String>> right = partition(s.substring(i, s.length()));
            for(int j = 0;j<left.size();j++){
                for(int k =0;k<right.size();k++){
                    ArrayList<String> p = new ArrayList<String>();
                    p.addAll(left.get(j));
                    p.addAll(right.get(k));
                    if(!list.contains(p)) list.add(p);
                }
            }

        }
        return list;
    }

    boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromePatitioning pp = new PalindromePatitioning();
        List<List<String>> list = pp.partition("amanaplanacanalpan");
        System.out.println(list.toString());
    }
}