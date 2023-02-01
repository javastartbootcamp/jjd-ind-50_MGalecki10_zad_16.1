package pl.javastart.task;

import java.util.*;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        Map<String, List> seasonsAndMonths = createSeasonsAndMonths();
        Season[] seasons = Season.values();

        String userSeason = showQuestion(scanner, seasons);
        for (Season season : seasons) {
            if (userSeason.equals(season.getPlName())) {
                List result = seasonsAndMonths.get(season.getPlName());
                System.out.println("W tej porze roku są następujące miesiące:");
                System.out.println(result);
            }
        }
    }

    private String showQuestion(Scanner scanner, Season[] seasons) {
        System.out.println("Podaj porę roku");
        for (Season season : seasons) {
            System.out.println(season.getPlName());
        }
        return scanner.nextLine();
    }

    private static final Map<String, List> createSeasonsAndMonths() {
        return Map.of("Zima", List.of("grudzień", "styczeń", "luty"),
                "Wiosna", List.of("marzec", "kwiecień", "maj"),
                "Lato", List.of("czerwiec", "lipiec", "sierpien"),
                "Jesień", List.of("wrzesień", "październik", "listopad"));
    }
}
