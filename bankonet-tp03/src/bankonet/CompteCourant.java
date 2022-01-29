package bankonet;

public class CompteCourant {

    String numero;
    String intitule;
    double solde=0;
    double montantDecouvertAutorise;
    static int nbComptesCourants = 0;

    public CompteCourant(){

    }

    public CompteCourant(String intitule, double solde, double montantDecouvertAutorise) {
        if(solde<0) {
            System.out.println("on ne peut créer un compte avec un solde négatif");
        }else{
            this.intitule = intitule;
            this.solde = solde;
            this.montantDecouvertAutorise = montantDecouvertAutorise;
            nbComptesCourants++;
        }

    }

    public void crediter(double montant){
        this.solde+=montant;
    }

    public void debiter(double montant){
        this.solde-=montant;
    }

    public String toString(){
        return "==================Numero de compte "+numero+"=============================================\n"+
        "Nom Compte : "+intitule+"\n"+
        "Type Compte : Compte couarant\n"+
        "Autorisation de découvert : "+montantDecouvertAutorise+"\n"+
        "Solde votre compte : "+solde+"\n"+
        "==========================================================================================";
    }
}
