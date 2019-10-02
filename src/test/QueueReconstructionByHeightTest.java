/*
 * @Author: Yixiong J
 * @Date: 2019-10-02 17:07:18
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 17:20:10
 * @Description: file content
 */
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class QueueReconstructionByHeightTest {

    @Test
    public void testReconstructQueue(){
        int[][] people1 = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] output1 = {{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}};
        assertArrayEquals(output1, new QueueReconstructionByHeight().reconstructQueue(people1),"case1");
        int[][] output2 = {{3,0},{5,0},{5,1},{4,2},{3,4}};
        int[][] people2 = {{3,4},{5,0},{4,2},{5,1},{3,0}};
        assertArrayEquals(output2, new QueueReconstructionByHeight().reconstructQueue(people2),"case2");
        int[][] output3 = {{1,0},{4,0},{5,0},{1,3},{7,0},{2,3},{4,3}};
        int[][] people3 = {{5,0},{7,0},{2,3},{1,0},{4,3},{4,0},{1,3}};
        assertArrayEquals(output3, new QueueReconstructionByHeight().reconstructQueue(people3),"case3");
    }
}