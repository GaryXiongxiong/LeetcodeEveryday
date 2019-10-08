/*
 * @Author: Yixiong J
 * @Date: 2019-10-08 17:10:35
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-08 17:24:41
 * @Description: https://leetcode.com/problems/student-attendance-record-i/
 */
public class StudentAttendanceRecordI {

    public boolean checkRecord(String s){
        int a = 0;
        int l = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='A') a++;
            if(s.charAt(i)=='L') l++;
            else l = 0;
            if(a>1||l>2) return false;
        }
        return true;
    }
}