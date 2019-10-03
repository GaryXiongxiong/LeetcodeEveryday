/*
 * @Author: Yixiong J
 * @Date: 2019-10-03 21:38:29
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-03 22:18:54
 * @Description: Test for Largest1BorderedSquare
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Largest1BorderedSquareTest {

    @Test
    public void testLargest1BorderedSquare(){
        int[][] grid1 = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int[][] grid2 = {
            {1,1,0,0}
        };
        int[][] grid3 = {
            {0,1,1,1,1},
            {1,1,0,1,1},
            {1,1,0,0,1},
            {1,1,1,1,1},
            {1,0,0,0,0}
        };
        int[][] grid4 = {
            {1,1,1,1},
            {1,0,1,1},
            {1,0,0,0},
            {1,1,0,1}
        };
        assertEquals(9, new Largest1BorderedSquare().largest1BorderedSquare(grid1));
        assertEquals(1, new Largest1BorderedSquare().largest1BorderedSquare(grid2));
        assertEquals(16, new Largest1BorderedSquare().largest1BorderedSquare(grid3));
        assertEquals(4, new Largest1BorderedSquare().largest1BorderedSquare(grid4));
    }
}