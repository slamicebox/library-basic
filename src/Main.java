import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int optiuneuser;
        int optiuneadmin;

        System.out.println("Login");

        System.out.println("Username:");
        String user = scanner.nextLine();

        System.out.println("Parola:");
        String password = scanner.nextLine();
        if (user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("bookadmin")) {
            do {
                System.out.println("\nMeniu:");
                System.out.println("1. Adaugă o carte");
                System.out.println("2. Afișează toate cărțile");
                System.out.println("3. Caută o carte");
                System.out.println("4. Șterge o carte");
                System.out.println("5. Ieșire");
                System.out.print("Alege o opțiune: ");

                optiuneadmin = scanner.nextInt();
                scanner.nextLine(); // consumă linia nouă

                switch (optiuneadmin) {
                    case 1:
                        // Adaugă carte
                        System.out.print("Titlul cărții: ");
                        String titlu = scanner.nextLine();
                        System.out.print("Autorul cărții: ");
                        String autor = scanner.nextLine();
                        System.out.print("Anul publicării: ");
                        int anulPublicarii = scanner.nextInt();
                        scanner.nextLine(); // consumă linia nouă
                        System.out.print("Genul cărții: ");
                        String gen = scanner.nextLine();
                        System.out.print("Numărul de pagini: ");
                        int numarPagini = scanner.nextInt();

                        Book carte = new Book(titlu, autor, anulPublicarii, gen, numarPagini);
                        biblioteca.adaugaCarte(carte);
                        break;

                    case 2:
                        // Afișează toate cărțile
                        biblioteca.afiseazaCarti();
                        break;

                    case 3:
                        // Caută carte
                        System.out.print("Introdu titlul cărții: ");
                        String titluCautat = scanner.nextLine();
                        Book carteCautata = biblioteca.cautaCarte(titluCautat);
                        if (carteCautata != null) {
                            System.out.println("Cartea găsită: " + carteCautata);
                        } else {
                            System.out.println("Cartea nu a fost găsită.");
                        }
                        break;

                    case 4:
                        // Șterge carte
                        System.out.print("Introdu titlul cărții de șters: ");
                        String titluDeSters = scanner.nextLine();
                        biblioteca.stergeCarte(titluDeSters);
                        break;

                    case 5:
                        // Ieșire
                        System.out.println("Ieșire din program.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opțiune invalidă.");
                }
            } while (optiuneadmin != 5);
        }

        if (user.equalsIgnoreCase("user")) {
            do {
                System.out.println("\nMeniu:");
                System.out.println("1. Afișează toate cărțile");
                System.out.println("2. Caută o carte");
                System.out.println("3. Ieșire");
                System.out.print("Alege o opțiune: ");

                optiuneuser = scanner.nextInt();
                scanner.nextLine(); // consumă linia nouă

                switch (optiuneuser) {
                    case 1:
                        // Afișează toate cărțile
                        biblioteca.afiseazaCarti();
                        break;

                    case 2:
                        // Caută carte
                        System.out.print("Introdu titlul cărții: ");
                        String titluCautat = scanner.nextLine();
                        Book carteCautata = biblioteca.cautaCarte(titluCautat);
                        if (carteCautata != null) {
                            System.out.println("Cartea găsită: " + carteCautata);
                        } else {
                            System.out.println("Cartea nu a fost găsită.");
                        }
                        break;

                    case 3:
                        // Ieșire
                        System.out.println("Ieșire din program.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opțiune invalidă.");
                }
            } while (optiuneuser != 3);
        }
        scanner.close();
    }
}