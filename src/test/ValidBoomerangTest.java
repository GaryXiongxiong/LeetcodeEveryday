/*
 * @Author: Yixiong J
 * @Date: 2019-10-06 21:57:59
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-06 22:14:35
 * @Description: Test for ValidBoomerang
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidBoomerangTest {

    @Test
    public void testIsBoomerang(){
        int[][] points = {{2,0},{2,1},{2,2}};
        assertEquals(false, new ValidBoomerang().isBoomerang(points));
    }
}