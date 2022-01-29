package com.bankonet.test;

import bankonet.Client;
import bankonet.CompteCourant;
import bankonet.CompteEpargne;
import bankonet.Compte;

public class TestClient {
    public static void main (String[] args){
        Client[] clientTab = new Client[3];

        clientTab[0] = new Client("12345","Agbessi","Kossi",null,null);
        clientTab[1] = new Client("12346","Dupont","Eric",null,null);
        clientTab[2] = new Client("12347","Gomez","Antoine",null,null);
        clientTab[0].setCompteCourant(new CompteCourant(clientTab[0].getPrenom()+ " "+ clientTab[0].getNom(),
                1000,800));
        clientTab[1].setCompteCourant(new CompteCourant(clientTab[1].getPrenom()+ " "+ clientTab[1].getNom(),
                2000,800));
        clientTab[2].setCompteCourant(new CompteCourant(clientTab[2].getPrenom()+ " "+ clientTab[2].getNom(),
                3000,800));
        clientTab[0].setCompteEpargne(new CompteEpargne(clientTab[0].getPrenom()+" "+ clientTab[0].getNom(),
                6000,0.45));
        clientTab[1].setCompteEpargne(new CompteEpargne(clientTab[1].getPrenom()+" "+ clientTab[1].getNom(),
                9000,0.45));
        for(Client cl : clientTab){
            System.out.println(cl.toString());
            if(cl.getCompteCourant()!=null){
                System.out.println(cl.getCompteCourant().toString());
            }
            if(cl.getCompteEpargne()!=null){
                System.out.println(cl.getCompteEpargne().toString());
            }
            System.out.println(cl.calculerAvoirGlobal());
        }
        try{
            clientTab[0].getCompteCourant().debiter(2000);
        }catch(Exception e){
            e.getMessage();
        }
        try{
             clientTab[1].getCompteEpargne().debiter(9050);
        }catch(Exception e){
            e.getMessage();
        }
        try{
             ((Compte)clientTab[0].getCompteCourant()).debiter(90);
        }catch(Exception e){
            e.getMessage();
        }
        try{
            clientTab[0].getCompteEpargne().effectuerVirement(clientTab[1].getCompteEpargne(),4050);
        }catch(Exception e){
            e.getMessage();
        }
    }
}
