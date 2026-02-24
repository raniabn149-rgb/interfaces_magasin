package magasin;

public class Article {

    protected double prixAchat;
    protected double prixVente;
    protected String nom;
    protected String fournisseur;

    public Article(String nom, String fournisseur, double prixAchat, double prixVente) {
        this.nom = nom;
        this.fournisseur = fournisseur;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    public double calculerRendement() {
        return (prixVente - prixAchat) / prixAchat;
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Fournisseur : " + fournisseur);
        System.out.println("Prix achat : " + prixAchat);
        System.out.println("Prix vente : " + prixVente);
    }
}