/*
 * @Author: Yixiong J
 * @Date: 2019-10-02 11:16:50
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 15:05:13
 * @Description: file content
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class SqrtXTest {
    static SqrtX x;
    @BeforeAll
    static void setup(){
        x = new SqrtX();
    }
    @DisplayName("mySqrt")
    @Test
    public void testMySqrt() {
        Assertions.assertEquals(3, x.mySqrt(9));
        Assertions.assertEquals(2, x.mySqrt(8));
        Assertions.assertEquals(11, x.mySqrt(122));
        
    }
}
