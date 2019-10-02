/*
 * @Author: Gary J
 * @Date: 2019-09-23 23:50:41
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 11:58:46
 * @Description: https://leetcode.com/problems/battleships-in-a-board/
 */
public class BattleshipsInBoard{
    public int countBattleships(char[][] board) {
        int count = 0;
        for(int x = 0;x<board.length;x++){
            for(int y = 0;y<board[x].length;y++){
                if(board[x][y]=='x' &&(x==0 || board[x-1][y]!='x')&&(y==0 || board[x][y-1]!='x')){
                    count++;
                }
            }
        }
        return count;
    }
}