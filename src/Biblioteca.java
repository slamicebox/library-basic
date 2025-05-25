import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Book> carti;

    // Constructor
    public Biblioteca() {
        this.carti = new ArrayList<>();
    }

    // Adaugă o carte nouă
    public void adaugaCarte(Book carte) {
        carti.add(carte);
        System.out.println("Cartea a fost adăugată: " + carte.getTitlu());
    }

    // Afișează toate cărțile din bibliotecă
    public void afiseazaCarti() {
        if (carti.isEmpty()) {
            System.out.println("Biblioteca este goală.");
        } else {
            System.out.println("Cărțile din bibliotecă:");
            for (Book carte : carti) {
                System.out.println(carte);
            }
        }
    }

    // Caută o carte după titlu
    public Book cautaCarte(String titlu) {
        for (Book carte : carti) {
            if (carte.getTitlu().equalsIgnoreCase(titlu)) {
                return carte;
            }
        }
        return null;
    }

    // Șterge o carte după titlu
    public void stergeCarte(String titlu) {
        Book carte = cautaCarte(titlu);
        if (carte != null) {
            carti.remove(carte);
            System.out.println("Cartea " + titlu + " a fost ștearsă.");
        } else {
            System.out.println("Cartea " + titlu + " nu a fost găsită.");
        }
    }
}