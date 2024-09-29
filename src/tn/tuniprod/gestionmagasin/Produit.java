package tn.tuniprod.gestionmagasin;

public class Produit {

    private String nom;
    private double prix;


    public Produit(String nom, double prix) {
        this.nom = nom;
        setPrix(prix);
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (prix < 0) {
            System.out.println("Le prix ne peut pas être négatif.");
        }
        this.prix = prix;
    }


    public String toString() {
        return "Produit{" + "nom='" + nom + '\'' + ", prix=" + prix + '}';
    }

}
