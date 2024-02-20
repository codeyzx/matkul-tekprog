package superclass;

// Abstract class yang merepresentasikan Lover
public abstract class Lover {
    private String name;

    public Lover(String name) {
        this.name = name;
    }

    // Abstract method untuk menentukan preferensi dari class Lover
    public abstract void preference();

    // Method getter untuk mendapatkan nama
    public String getName() {
        return name;
    }
}