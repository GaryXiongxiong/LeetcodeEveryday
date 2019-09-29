/*
 * @Author: Gary J
 * @Date: 2019-09-29 22:50:58
 * @LastEditors: Gary J
 * @LastEditTime: 2019-09-29 23:25:35
 * @Description: https://leetcode.com/problems/max-area-of-island/
 */
import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland{
    public int maxAreaOfIsland(int[][] grid){
        int height = grid.length;
        int width = grid[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        int maxArea = 0;
        for(int y = 0;y<height;y++){
            for(int x = 0;x<width;x++){
                if(grid[y][x]==1){
                    int[] pos = {y,x};
                    queue.add(pos);
                    grid[pos[0]][pos[1]] = 0;
                    int area = 0;
                    while(!queue.isEmpty()){
                        pos = queue.poll();
                        area++;
                        if(pos[0]-1>=0&&grid[pos[0]-1][pos[1]]==1){
                            int[] nextPos = {pos[0]-1,pos[1]};
                            grid[nextPos[0]][nextPos[1]] = 0;
                            queue.add(nextPos);
                        }
                        if(pos[0]+1<height&&grid[pos[0]+1][pos[1]]==1){
                            int[] nextPos = {pos[0]+1,pos[1]};
                            grid[nextPos[0]][nextPos[1]] = 0;
                            queue.add(nextPos);
                        }
                        if(pos[1]-1>=0&&grid[pos[0]][pos[1]-1]==1){
                            int[] nextPos = {pos[0],pos[1]-1};
                            grid[nextPos[0]][nextPos[1]] = 0;
                            queue.add(nextPos);
                        }
                        if(pos[1]+1<width&&grid[pos[0]][pos[1]+1]==1){
                            int[] nextPos = {pos[0],pos[1]+1};
                            grid[nextPos[0]][nextPos[1]] = 0;
                            queue.add(nextPos);
                        }
                    }
                    if(area>maxArea) maxArea = area;
                }
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        MaxAreaOfIsland maoi = new MaxAreaOfIsland();
        int[][] grid = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,1,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(maoi.maxAreaOfIsland(grid));
    }
}