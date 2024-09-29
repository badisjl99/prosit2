package tn.tuniprod.gestionmagasin;

public class Main {

    public static void main(String[] args) {
        Produit produit1 = new Produit("Lenovo c12", 1500);
        Produit produit2 = new Produit("Dell 4080d", 50);


        Magasin magasin1 = new Magasin(1, "avenue Habib Borguiba", 100);
        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);

        magasin1.afficherDetailsMagasin();

        Magasin magasin2 = new Magasin(2, "Avenue de la liberte", 80);


        GestionMagasins gestionMagasins = new GestionMagasins();
        gestionMagasins.ajouterMagasin(magasin1);
        gestionMagasins.ajouterMagasin(magasin2);
        System.out.println("Nombre total de produits dans tous les magasins : " + gestionMagasins.getTotalProduits());
    }
    }
