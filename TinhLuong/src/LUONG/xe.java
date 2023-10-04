package LUONG;

import java.util.Scanner;
import java.time.LocalTime;
public class xe {
	public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(17, 30, 0);
        LocalTime time2 = LocalTime.of(12, 0, 0);

        // So sánh 2 thời gian
        if (time1.isBefore(time2)) {
            System.out.println(time1 + " trước " + time2);
        } else if (time1.isAfter(time2)) {
            System.out.println(time1 + " sau " + time2);
        } else {
            System.out.println(time1 + " và " + time2 + " bằng nhau");
        }
    }
	 
}
