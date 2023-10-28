package ss4_oop.bai_tap.stop_watch;

import java.sql.Time;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class StopWatch {
    public double startTime;
    public double endTime;

    public StopWatch() {
    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();

    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
