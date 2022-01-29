package com.bankonet.test;

import bankonet.CompteCourant;

public class TestCompteCourant {

    public static void main (String[] args){

        CompteCourant compteCourant1 = new CompteCourant("Kossi Agbessi",100.12,800);
        compteCourant1.setNumero("1001");

        CompteCourant compteCourant2 = new CompteCourant("Eric DUPONT",2500.12,800);
        compteCourant2.setNumero("1002");

        CompteCourant compteCourant3 = new CompteCourant("Antoine GOMEZ",4000,800);
        compteCourant3.setNumero("1003");

        imprimer(compteCourant1);
        imprimer(compteCourant2);
        imprimer(compteCourant3);
        try{
        compteCourant1.crediter(1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            compteCourant2.debiter(500);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(compteCourant1.toString());
        System.out.println(compteCourant2.toString());

        CompteCourant[] compteCourantTab = new CompteCourant[3];
        compteCourantTab[0] = compteCourant1;
        compteCourantTab[1] = compteCourant2;
        compteCourantTab[2] = compteCourant3;

        CompteCourant compteCourant4 = new CompteCourant("Antoine GOMEZ",-90,800);
        imprimer(compteCourant4);

        for(int i=0; i<3;i++){
            System.out.println("*****************"+compteCourantTab[i].toString());
        }
        for(CompteCourant com : compteCourantTab){
            System.out.println("-----------------"+com.toString());
        }


    }
    public static void imprimer(CompteCourant compteCourant){
        System.out.println("==================Numero de compte "+compteCourant.getNumero()+"=============================================");
        System.out.println("Nom Compte : "+compteCourant.getIntitule());
        System.out.println("Type Compte : Compte couarant");
        System.out.println("Autorisation de découvert : "+compteCourant.getMontantDecouvertAutorise());
        System.out.println("Solde votre compte : "+compteCourant.getSolde());
        System.out.println("==========================================================================================");

    }
}
