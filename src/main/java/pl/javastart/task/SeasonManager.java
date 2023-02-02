package pl.javastart.task;

import java.util.*;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        Season[] seasons = Season.values();

        Season season = showQuestion(scanner);
        if (season != null) {
            String[] months = season.getMonths();
            System.out.println("W tej porze roku są następujące miesiące:");
            for (String month : months) {
                System.out.println(month);
            }
        } else {
            System.out.println("Pora roku jest nieprawidłowa");
        }
    }

    private Season showQuestion(Scanner scanner) {
        System.out.println("Podaj porę roku");
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season.getPlName());
        }
        String seasonFromUser = scanner.nextLine();
        return Season.createFromPlName(seasonFromUser);
    }
}
