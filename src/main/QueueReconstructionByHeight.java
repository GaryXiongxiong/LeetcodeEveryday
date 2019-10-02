import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * @Author: Yixiong J
 * @Date: 2019-10-02 16:07:10
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 17:27:51
 * @Description: https://leetcode.com/problems/queue-reconstruction-by-height/
 */
public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people){
        ArrayList<int[]> peopleList = new ArrayList<int[]>(Arrays.asList(people));
        ArrayList<int[]> reconstruction = new ArrayList<int[]>();
        Comparator<int[]> c = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o2[1]-o1[1];
                }
                return o1[0]-o2[0];
            }
        };
        peopleList.sort(c);
        Collections.reverse(peopleList);
        for(int[] guy : peopleList){
            int before = guy[1];
            if(reconstruction.size() == 0){
                reconstruction.add(guy);
            }
            else{
                for(int i = 0;i <= reconstruction.size();i++){
                    if(before == 0){
                        reconstruction.add(i, guy);
                        break;
                    }
                    if(reconstruction.get(i)[0]>=guy[0]){
                        before--;
                    }
                }
            }
        }
        return reconstruction.toArray(new int[0][0]);
    }
    public static void main(String[] args) {

    }
}