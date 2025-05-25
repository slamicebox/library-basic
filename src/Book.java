public class Book {
    private String titlu;
    private String autor;
    private int anulPublicarii;
    private String gen;
    private int numarPagini;

    // Constructor
    public Book(String titlu, String autor, int anulPublicarii, String gen, int numarPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anulPublicarii = anulPublicarii;
        this.gen = gen;
        this.numarPagini = numarPagini;
    }

    // Getters și Setters
    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnulPublicarii() {
        return anulPublicarii;
    }

    public void setAnulPublicarii(int anulPublicarii) {
        this.anulPublicarii = anulPublicarii;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getNumarPagini() {
        return numarPagini;
    }

    public void setNumarPagini(int numarPagini) {
        this.numarPagini = numarPagini;
    }

    // Metodă pentru afișarea informațiilor despre carte
    @Override
    public String toString() {
        return "Titlu: " + titlu + ", Autor: " + autor + ", Anul Publicării: " + anulPublicarii +
                ", Gen: " + gen + ", Număr Pagini: " + numarPagini;
    }
}
