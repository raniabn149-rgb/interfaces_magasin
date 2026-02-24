package magasin;

public class Magasin {

    private double depenses;
    private double revenus;

    private Electromenager[] electros = new Electromenager[2];
    private Primeur[] primeurs = new Primeur[2];

    public Magasin() {
        depenses = 0;
        revenus = 0;
    }

    public void ajouterElectro(int i, Electromenager e) {
        electros[i] = e;
    }

    public void ajouterPrimeur(int i, Primeur p) {
        primeurs[i] = p;
    }

    public void afficherEtat() {
        System.out.println("Dépenses : " + depenses);
        System.out.println("Revenus : " + revenus);
        System.out.println("Rendement magasin : " + calculerRendement());
    }

    public double calculerRendement() {
        return (revenus - depenses) / depenses;
    }

    public void ajouterDepense(double d) {
        depenses += d;
    }

    public void ajouterRevenu(double r) {
        revenus += r;
    }
}