package com.bankonet;

public class TestCompteCourant {

    public static void main (String[] args){

        CompteCourant compteCourant1 = new CompteCourant();
        CompteCourant.nbComptesCourants++;
        compteCourant1.numero="1000"+CompteCourant.nbComptesCourants;
        compteCourant1.intitule = "Kossi Agbessi";
        compteCourant1.montantDecouvertAutorise = 800;
        compteCourant1.solde = 100.12;
        CompteCourant compteCourant2 = new CompteCourant();
        CompteCourant.nbComptesCourants++;
        compteCourant2.numero="1000"+CompteCourant.nbComptesCourants;
        compteCourant2.intitule = "Eric DUPONT";
        compteCourant2.montantDecouvertAutorise = 800;
        compteCourant2.solde = 2500.12;
        CompteCourant compteCourant3 = new CompteCourant();
        CompteCourant.nbComptesCourants++;
        compteCourant3.numero="1000"+CompteCourant.nbComptesCourants;
        compteCourant3.intitule = "Antoine GOMEZ";
        compteCourant3.montantDecouvertAutorise = 800;
        compteCourant3.solde = 4000.0;

        imprimer(compteCourant1);
        imprimer(compteCourant2);
        imprimer(compteCourant3);
    }
    public static void imprimer(CompteCourant compteCourant){
        System.out.println("==================Numero de compte "+compteCourant.numero+"=============================================");
        System.out.println("Nom Compte : "+compteCourant.intitule);
        System.out.println("Type Compte : Compte couarant");
        System.out.println("Autorisation de découvert : "+compteCourant.montantDecouvertAutorise);
        System.out.println("Solde votre compte : "+compteCourant.solde);
        System.out.println("==========================================================================================");
    }
}
