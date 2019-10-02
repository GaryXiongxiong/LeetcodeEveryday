import java.util.Arrays;
import java.util.HashSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/*
 * @Author: Yixiong J
 * @Date: 2019-10-02 15:39:00
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 16:02:32
 * @Description: Test for UncommonWordsFromTwoSentences
 */

public class UncommonWordsFromTwoSentencesTest {
    static UncommonWordsFromTwoSentences uwfts;
    @BeforeAll
    static void setup(){
        uwfts = new UncommonWordsFromTwoSentences();
    }
    @Test
    public void testUncommonFromSentences(){
        String[] input1 = {"this apple is sweet","this apple is sour"};
        String[] output1list = {"sweet","sour"};
        HashSet<String> output1 = new HashSet<String>(Arrays.asList(output1list));
        String[] input2 = {"apple apple","banana"};
        String[] output2list = {"banana"};
        HashSet<String> output2 = new HashSet<String>(Arrays.asList(output2list));
        Assertions.assertEquals(output1, new HashSet<String>(Arrays.asList(uwfts.uncommonFromSentences(input1[0], input1[1]))));
        Assertions.assertEquals(output2, new HashSet<String>(Arrays.asList(uwfts.uncommonFromSentences(input2[0], input2[1]))));
    }
}