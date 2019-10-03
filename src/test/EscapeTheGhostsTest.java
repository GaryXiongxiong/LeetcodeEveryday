/*
 * @Author: Yixiong J
 * @Date: 2019-10-03 20:55:33
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-03 21:04:53
 * @Description: Test for EscapeTheGhosts
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EscapeTheGhostsTest {

    @Test
    public void testEscapeGhosts(){
        int[][] ghosts1 = {{1,0},{0,3}};
        int[] target1 = {0,1};
        assertEquals(true, new EscapeTheGhosts().escapeGhosts(ghosts1, target1));
        int[][] ghosts2 = {{1,0}};
        int[] target2 = {2,0};
        assertEquals(false, new EscapeTheGhosts().escapeGhosts(ghosts2, target2));
        int[][] ghosts3 = {{2,0}};
        int[] target3 = {1,0};
        assertEquals(false, new EscapeTheGhosts().escapeGhosts(ghosts3, target3));
    }
}