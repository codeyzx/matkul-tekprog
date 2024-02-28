package utils.enums;

public enum FilmKategori {
    SU("Semua Umur"),
    D("Dewasa"),
    R("Remaja"),
    A("Anak-Anak");

    private final String description;

    FilmKategori(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
