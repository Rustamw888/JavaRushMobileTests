package enums;

public enum Languages {

    RUSSIAN("РУССКИЙ"),
    UKRAINIAN("УКРАЇНСЬКА"),
    ENGLISH("ENGLISH");

    private final String languageName;

    Languages(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageName() {
        return languageName;
    }
}
