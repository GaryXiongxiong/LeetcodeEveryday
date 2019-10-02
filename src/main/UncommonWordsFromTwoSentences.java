import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author: Yixiong J
 * @Date: 2019-10-02 15:10:56
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 16:02:22
 * @Description: https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String a, String b){
        Map<String,Integer> wordsA = new HashMap<String,Integer>();
        Map<String,Integer> wordsB = new HashMap<String,Integer>();
        for(String word:a.split(" ")){
            int value;
            if(wordsA.containsKey(word)){
                value = wordsA.get(word)+1;
            }
            else{
                value = 1;
            }
            wordsA.put(word, value);
        }
        for(String word:b.split(" ")){
            int value;
            if(wordsB.containsKey(word)){
                value = wordsB.get(word)+1;
            }
            else{
                value = 1;
            }
            wordsB.put(word, value);
        }
        ArrayList<String> uncommonWords = new ArrayList<String>();
        for(String word : wordsA.keySet()){
            if(!wordsB.containsKey(word) && wordsA.get(word)==1){
                uncommonWords.add(word);
            }
        }
        for(String word : wordsB.keySet()){
            if(!wordsA.containsKey(word) && wordsB.get(word)==1){
                uncommonWords.add(word);
            }
        }
        String[] result = {};
        result = uncommonWords.toArray(result);
        return result;
    }
}