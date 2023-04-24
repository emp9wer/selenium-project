package Java_Office_HoursKir.week10.morning;

import java.util.ArrayList;

public class Show {

    String name;
    int numberOfSeasons;
    boolean isCompleted;
    ArrayList<String> audioLanguages;

    public Show(String name, int numberOfSeasons, boolean isCompleted) {
        this.name = name;
        this.numberOfSeasons = numberOfSeasons;
        this.isCompleted = isCompleted;
    }

    public Show(String name, int numberOfSeasons, boolean isCompleted, ArrayList<String> audioLanguages) {
        this.name = name;
        this.numberOfSeasons = numberOfSeasons;
        this.isCompleted = isCompleted;
        this.audioLanguages = audioLanguages;
    }
}
