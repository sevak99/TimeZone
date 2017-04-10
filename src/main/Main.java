package main;

import timeZone.AllTimeZones;

import java.io.File;
import java.io.IOException;

/**
 * Created by СЕВАК on 10.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("zone.csv");

        AllTimeZones timeZones = new AllTimeZones();
        timeZones.setTimeZones(file);

        timeZones.sort();
    }
}
