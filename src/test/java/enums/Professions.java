package enums;

public enum Professions {

    JAVA_DEVELOPER("JAVA-РАЗРАБОТЧИКОМ"),
    ANDROID_DEVELOPER("ANDROID-РАЗРАБОТЧИКОМ"),
    QA_ENGINEER("ИНЖЕНЕРОМ ТЕСТИРОВАНИЯ");

    private final String profession;

    Professions(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}
