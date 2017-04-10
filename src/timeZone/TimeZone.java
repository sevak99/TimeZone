package timeZone;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by СЕВАК on 10.04.2017.
 */
public class TimeZone {
    private int id;
    private String conutryCode;
    private String timeZone;

    public TimeZone(int id, String conutryCode, String timeZone) {
        this.id = id;
        this.conutryCode = conutryCode;
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id).append(". ")
                .append(conutryCode).append(", ")
                .append(timeZone);
        return builder.toString();
    }

    public static class Comparator1 implements Comparator<TimeZone> {

        @Override
        public int compare(TimeZone o1, TimeZone o2) {
            return o1.conutryCode.compareTo(o2.conutryCode);
        }
    }
    public static class Comparator2 implements Comparator<TimeZone> {

        @Override
        public int compare(TimeZone o1, TimeZone o2) {
            return o1.timeZone.compareTo(o2.timeZone);
        }
    }
}