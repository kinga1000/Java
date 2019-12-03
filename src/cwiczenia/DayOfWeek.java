package cwiczenia;

import java.util.ArrayList;
import java.util.List;

public enum DayOfWeek {


    MON("Poniedzialek", "Monday", 1, true),
    TUE("Wtorek", "Tuesday", 2, true),
    WED("Sroda", "Wednesday", 3, true),
    THU("Czwartek", "Thursday", 4, true),
    FRI("Piatek", "Friday", 5, true),
    SAT("Sobota", "Saturday", 6, false),
    SUN("Niedziela", "Sunday", 7, false);


    private String polishName;
    private String englishName;
    private int index;
    private boolean workingDay;

    DayOfWeek(String polishName, String englishName, int index, boolean workingDay) {
        this.polishName = polishName;
        this.englishName = englishName;
        this.index = index;
        this.workingDay = workingDay;
    }

    public int getIndex() {

        return index;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public String getPolishName() {
        return polishName;
    }

    public static DayOfWeek fromPolishName(String polishName) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.polishName.equals(polishName)) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with polish name " + polishName);
    }

    public static boolean isWeekend(DayOfWeek day) {
        if (day.workingDay == true) {
            return false;
        } else {
            return true;
        }
    }


    public static DayOfWeek fromEnglishName(String englishName) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.englishName.equals(englishName)) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with english name " + englishName);
    }


    public static ArrayList<DayOfWeek> getWeekend(boolean isWeekend) {
        ArrayList<DayOfWeek> weekend = new ArrayList<>();
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (isWeekend(dayOfWeek) == true) {
                weekend.add(dayOfWeek);
            }
        }
        return weekend;
    }

    public static ArrayList<DayOfWeek> getWorkingday(boolean isWeekend) {
        ArrayList<DayOfWeek> workingdays = new ArrayList<>();
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (isWeekend(dayOfWeek) == false) {
                workingdays.add(dayOfWeek);
            }
        }
        return workingdays;
    }
}