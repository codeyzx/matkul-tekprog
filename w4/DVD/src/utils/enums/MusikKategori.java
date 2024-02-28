package utils.enums;

public enum MusikKategori {
    C("Classic"),
    J("Jazz"),
    P("Pop"),
    R("Rock"),
    O("Other");

    private final String description;

    MusikKategori(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
