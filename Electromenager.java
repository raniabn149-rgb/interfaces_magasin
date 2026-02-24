package magasin;

public class Electromenager extends Article
        implements VendableParPiece, Soldable {

    private int stock;

    public Electromenager(String nom, String fournisseur,
                          double prixAchat, double prixVente) {
        super(nom, fournisseur, prixAchat, prixVente);
        stock = 0;
    }

    public double remplirStock(int qte) {
        stock += qte;
        return prixAchat * qte;
    }

    @Override
    public double vendre(int qte) {
        stock -= qte;
        return prixVente * qte;
    }

    @Override
    public void lancerSolde(double pourcentage) {
        prixVente -= prixVente * pourcentage / 100;
    }

    @Override
    public void terminerSolde(double pourcentage) {
        prixVente += prixVente * pourcentage / 100;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Stock : " + stock);
        System.out.println("Rendement : " + calculerRendement());
    }
}