package tn.tuniprod.gestionmagasin;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private int id;
    private String adresse;
    private int capacite;
    private List<Produit> produits;

    private static final int MAX_PRODUITS = 50;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        if (produits.size() < MAX_PRODUITS) {
            produits.add(produit);
        } else {
            System.out.println("capacite maximale atteinte !");
        }
    }

    public void afficherDetailsMagasin() {
        System.out.println("ID du magasin : " + id);
        System.out.println("Adresse : " + adresse);
        System.out.println("Capacité : " + capacite);
        System.out.println("Produits dans le magasin :");
        for (Produit produit : produits) {
            System.out.println(produit.getNom() + " - " + produit.getPrix() + " DT");
        }
    }

    public int getNombreProduits() {
        return produits.size();
    }
}