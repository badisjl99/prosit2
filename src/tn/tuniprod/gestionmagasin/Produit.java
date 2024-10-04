package tn.tuniprod.gestionmagasin;

public class Produit {

    private String nom;
    private double prix;
    private String libelle ;
    private static int  counter ;



    public Produit(String nom, double prix) {
        counter++ ;
        this.nom = nom;
        setPrix(prix);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
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

    public void comparer(Produit p){
        if(p.equals(this)){
            System.out.println("Les Produit sont identiques");
        }else {
            System.out.println("Les Produit ne sont pas identiques");
        }
    }

    public String comparer(Produit p1,Produit p2){
        return p1.equals(p2) ? "Identiques" : "ne sont pas identiques" ;
    }



    public String toString() {
        return "Produit{" + "nom='" + nom + '\'' + ", prix=" + prix + '}';
    }

}
