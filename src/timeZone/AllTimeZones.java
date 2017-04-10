package timeZone;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by СЕВАК on 10.04.2017.
 */
public class AllTimeZones {
    private ArrayList<TimeZone> timeZones;

    public AllTimeZones() {
     timeZones = new ArrayList<>();
    }

    public void setTimeZones(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String string;
        while ((string = reader.readLine()) != null) {
            String[] str = string.split(",");
            for(int i = 0; i < str.length ; i++) {
                str[i] = str[i].substring(1, str[i].length() - 1);
            }

            timeZones.add(new TimeZone(Integer.parseInt(str[0]), str[1], str[2]));
        }
    }

    public void sort() {
        Scanner scanner = new Scanner(System.in);

        Comparator<TimeZone> timeZoneComparator = null;

        System.out.print("Enter 1 or 2: ");
        bb:
        for(;;) {
            aa:
            switch (scanner.nextInt()) {
                case 1:
                    timeZoneComparator = new TimeZone.Comparator1();
                    break bb;
                case 2:
                    timeZoneComparator = new TimeZone.Comparator2();
                    break bb;
                default:
                    System.out.println("Warning");
                    System.out.print("Enter 1 or 2: ");
                    break aa;
            }
        }

        Collections.sort(timeZones, timeZoneComparator);
        printTimeZones();
    }

    public void printTimeZones() {
        for (int i = 0; i < timeZones.size(); i++) {
            System.out.println(timeZones.get(i));
        }
    }
}
