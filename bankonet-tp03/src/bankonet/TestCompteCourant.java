package bankonet;

public class TestCompteCourant {

    public static void main (String[] args){

        CompteCourant compteCourant1 = new CompteCourant("Kossi Agbessi",100.12,800);
        compteCourant1.numero="100"+CompteCourant.nbComptesCourants;

        CompteCourant compteCourant2 = new CompteCourant("Eric DUPONT",2500.12,800);
        compteCourant2.numero="100"+CompteCourant.nbComptesCourants;

        CompteCourant compteCourant3 = new CompteCourant("Antoine GOMEZ",4000,800);
        compteCourant3.numero="100"+CompteCourant.nbComptesCourants;

        imprimer(compteCourant1);
        imprimer(compteCourant2);
        imprimer(compteCourant3);
        compteCourant1.crediter(1000);
        compteCourant2.debiter(500);
        System.out.println(compteCourant1.toString());
        System.out.println(compteCourant2.toString());

        CompteCourant[] compteCourantTab = new CompteCourant[3];
        compteCourantTab[0] = compteCourant1;
        compteCourantTab[1] = compteCourant2;
        compteCourantTab[2] = compteCourant3;

        CompteCourant compteCourant4 = new CompteCourant("Antoine GOMEZ",-90,800);
        imprimer(compteCourant4);

        switch (0) {

            case 0:

                System.out.println("solde nul");

                break;

            case 10000:

                System.out.println("solde créditeur");

                break;

            default:

                System.out.println("ras");

                break;

        }

        for(int i=0; i<3;i++){
            System.out.println("*****************"+compteCourantTab[i].toString());
        }
        for(CompteCourant com : compteCourantTab){
            System.out.println("-----------------"+com.toString());
        }
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
