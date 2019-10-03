/*
 * @Author: Yixiong J
 * @Date: 2019-10-03 21:17:08
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-03 21:54:57
 * @Description: https://leetcode.com/problems/largest-1-bordered-square/
 */

public class Largest1BorderedSquare {
    // TODO: fix the test case 4
    public int largest1BorderedSquare(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int maxSquare = 0;
        for(int y = 0; y<height;y++){
            for(int x = 0;x<width;x++){
                if(grid[y][x]==1){
                    int squareWidth = 0;
                    int squareHeight = 0;
                    for(int scanX = x;scanX<width;scanX++){
                        if(grid[y][scanX]!=1){
                            squareWidth = scanX - x;
                            break;
                        }
                        if(scanX+1>=width) squareWidth = scanX-x+1;
                    }
                    for(int scanY = y;scanY<height;scanY++){
                        if(grid[scanY][x]!=1){
                            squareHeight = scanY - y;
                            break;
                        }
                        if(scanY+1>=height){
                            squareHeight = scanY-y+1;
                            break;
                        } 
                    }
                    int squareSideLength = Math.min(squareHeight, squareWidth);
                    maxSquare = Math.max(maxSquare, squareSideLength*squareSideLength);
                }
            }
        }
        return maxSquare;
    }
}