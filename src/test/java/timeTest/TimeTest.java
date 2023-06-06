package timeTest;

import time.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();
        time.setTime(12, 36, 2);
        System.out.println(time.getSecondSinceMeadNight());
    }
}
