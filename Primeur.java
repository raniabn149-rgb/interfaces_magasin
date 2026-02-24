package magasin;

public class Primeur extends Article
        implements VendableParKilogramme {

    private double stock;

    public Primeur(String nom, String fournisseur,
                   double prixAchat, double prixVente) {
        super(nom, fournisseur, prixAchat, prixVente);
        stock = 0;
    }

    public double remplirStock(double qte) {
        stock += qte;
        return prixAchat * qte;
    }

    @Override
    public double vendre(double qte) {
        stock -= qte;
        return prixVente * qte;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Stock (kg) : " + stock);
        System.out.println("Rendement : " + calculerRendement());
    }
}