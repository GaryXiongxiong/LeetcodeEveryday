/*
 * @Author: Yixiong J
 * @Date: 2019-10-03 21:17:08
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-03 22:22:20
 * @Description: https://leetcode.com/problems/largest-1-bordered-square/
 */

public class Largest1BorderedSquare {
    public int largest1BorderedSquare(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int maxLength = 0;
        for(int y = 0; y<height;y++){
            for(int x = 0;x<width;x++){
                if(grid[y][x]==1){
                    for(int length = 0;x+length<width&&y+length<height&&grid[y][x+length]==1&&grid[y+length][x]==1;length++){
                        boolean bordered = true;
                        for(int i = 0;i<length+1;i++){
                            bordered = bordered&&(grid[y+i][x+length] == 1)&&(grid[y+length][x+i]==1);
                        }
                        if(bordered) maxLength = Math.max(maxLength,length+1);
                    }
                }
            }
        }
        return maxLength*maxLength;
    }
}