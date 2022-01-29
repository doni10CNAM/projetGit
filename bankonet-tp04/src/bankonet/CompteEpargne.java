package bankonet;

public class CompteEpargne {

    private String numero;
    private String intitule;
    private double solde=0;
    private double tauxInteret;

    public CompteEpargne(){

    }


    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero =numero;
    }

    public String getIntitule(){
        return this.intitule;
    }
    public void setIntitule(String intitule){
        this.intitule = intitule;
    }

    public double getMontantDecouvertAutorise(){
        return this.tauxInteret;
    }
    public void setTauxInteret(double montantDecouvertAutorise){
        this.tauxInteret = montantDecouvertAutorise;
    }


    public double getSolde(){
        return this.solde;
    }
    public CompteEpargne(String intitule, double solde, double tauxInteret) {
        if(solde<0) {
            System.out.println("on ne peut créer un compte avec un solde négatif");
        }else{
            this.intitule = intitule;
            this.solde = solde;
            this.tauxInteret = tauxInteret;
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
                "taux d'interet : "+tauxInteret+"\n"+
                "Solde votre compte : "+solde+"\n"+
                "==========================================================================================";
    }
}
