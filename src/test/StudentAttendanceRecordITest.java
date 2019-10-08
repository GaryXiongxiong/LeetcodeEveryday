/*
 * @Author: Yixiong J
 * @Date: 2019-10-08 17:25:44
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-08 17:31:20
 * @Description: Test for StudentAttendanceRecordI
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentAttendanceRecordITest {

    @Test
    public void testCheckRecord(){
        assertEquals(true, new StudentAttendanceRecordI().checkRecord("PPALLP"));
        assertEquals(false, new StudentAttendanceRecordI().checkRecord("PPALLL"));
        assertEquals(true, new StudentAttendanceRecordI().checkRecord("LALL"));
    }
}