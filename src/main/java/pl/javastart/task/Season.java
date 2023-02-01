package pl.javastart.task;

public enum Season {
    SPRING("Wiosna"),
    SUMMER("Lato"),
    AUTUMN("Jesień"),
    WINTER("Zima");

    private final String plName;

    Season(String plName) {
        this.plName = plName;
    }

    public String getPlName() {
        return plName;
    }
}