package tn.tuniprod.gestionmagasin;

import java.util.Arrays;

public class Magasin {

    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nbrProduits;

    private static final int MAX_PRODUITS = 50;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[MAX_PRODUITS];
        this.nbrProduits = 0;
    }

    public void ajouterProduit(Produit produit) {
        if (nbrProduits < MAX_PRODUITS && !rechercherProduit(produit)) {
            produits[nbrProduits++] = produit;
        } else {
            System.out.println("cpacité maximale atteinte ou produit deja present !");
        }
    }

    public void afficherDetailsMagasin() {
        System.out.println("ID du magasin : " + id);
        System.out.println("Adresse : " + adresse);
        System.out.println("Capacité : " + capacite);
        System.out.println("Produits dans le magasin :");
        for (int i = 0; i < nbrProduits; i++) {
            Produit produit = produits[i];
            System.out.println(produit.getNom() + " - " + produit.getPrix() + " DT");
        }
    }

    public void afficherLibelleProduits() {
        for (int i = 0; i < nbrProduits; i++) {
            System.out.println(produits[i].getLibelle());
        }
    }

    public boolean rechercherProduit(Produit p) {
        for (int i = 0; i < nbrProduits; i++) {
            if (produits[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    public void afficherTousLesProuduits() {
        for (int i = 0; i < nbrProduits; i++) {
            System.out.println(produits[i].toString());
        }
    }

    public int getNombreProduits() {
        return nbrProduits;
    }

    public void maxMagasin(Magasin m1, Magasin m2) {
        if (m1.nbrProduits > m2.nbrProduits) {
            System.out.println("Le magasin avec l'adresse "+m1.adresse + " est plus grande");
        } else if (m1.nbrProduits < m2.nbrProduits) {
            System.out.println("Le magasin avec l'adresse "+m2.adresse + " est plus grande");
        } else {
            System.out.println("Le magasin avec l'adresse "+m1.adresse + " est égale à " + m2.adresse);
        }
    }
}
