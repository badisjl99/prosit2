package tn.tuniprod.gestionmagasin;

import java.util.ArrayList;
import java.util.List;

public class GestionMagasins {
    private List<Magasin> magasins;

    public GestionMagasins() {
        magasins = new ArrayList<>();
    }

    public void ajouterMagasin(Magasin magasin) {
        magasins.add(magasin);
    }

    public int getTotalProduits() {
        int totalProduits = 0;
        for (Magasin magasin : magasins) {
            totalProduits += magasin.getNombreProduits();
        }
        return totalProduits;
    }
}