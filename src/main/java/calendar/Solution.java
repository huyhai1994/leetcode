package calendar;

import java.time.LocalDate;

public class Solution {
    public static String findDay(int month, int day, int year) {
        return String.valueOf(LocalDate.of(year, month, day).getDayOfWeek());
    }

    public static void main(String[] args) {
        int month = 8;
        int day = 14;
        int year = 2017;
        System.out.println(findDay(month, day, year));
    }
}
