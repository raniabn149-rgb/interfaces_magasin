package magasin;

public class main {
    public static void main(String[] args) {

        Magasin m = new Magasin();

        Electromenager tv = new Electromenager(
                "TV", "Samsung", 800, 1200);
        Primeur pomme = new Primeur(
                "Pomme", "Fermier", 1, 2);

        m.ajouterElectro(0, tv);
        m.ajouterPrimeur(0, pomme);

        m.ajouterDepense(tv.remplirStock(5));
        m.ajouterDepense(pomme.remplirStock(100));

        m.ajouterRevenu(tv.vendre(2));
        m.ajouterRevenu(pomme.vendre(10));

        tv.lancerSolde(10);

        tv.afficher();
        pomme.afficher();
        m.afficherEtat();
    }
}