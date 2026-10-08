package tn.mediatheque;

public class Main {

    public static void main(String[] args) {

        Catalogue<Document> catalogue = new Catalogue<>();

        Livre livre = new Livre(
                "Clean Code",
                2008,
                "Robert Martin",
                464
        );

        Revue revue = new Revue(
                "Science",
                2026,
                412
        );

        catalogue.ajouter(livre);
        catalogue.ajouter(revue);

        System.out.println("=== CATALOGUE ===");
        catalogue.afficherTout();

        System.out.println("\n=== RECHERCHE ===");

        catalogue.rechercherParTitre("Clean Code")
                .ifPresent(d -> System.out.println(
                        "Document trouvé : " + d.descriptionCourte()
                ));

        System.out.println("\n=== EMPRUNT ===");

        System.out.println(
                "Disponible avant : " + livre.estDisponible()
        );

        livre.emprunter();

        System.out.println(
                "Disponible après emprunt : " + livre.estDisponible()
        );

        livre.rendre();

        System.out.println(
                "Disponible après retour : " + livre.estDisponible()
        );

        // =========================
        // DOUBLE EMPRUNT
        // =========================

        System.out.println("\n=== DOUBLE EMPRUNT ===");

        livre.emprunter();

        System.out.println("Premier emprunt effectué.");

        try {
            livre.emprunter();

        } catch (DocumentIndisponibleException e) {

            System.out.println(
                    "Exception détectée : " + e.getMessage()
            );
        }
    }
}