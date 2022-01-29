package bankonet;

public class CompteCourant {

    private String numero;
    private String intitule;
    private double solde=0;
    private double montantDecouvertAutorise;

    public CompteCourant(){

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
        return this.montantDecouvertAutorise;
    }
    public void setMontantDecouvertAutorise(double montantDecouvertAutorise){
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }


    public double getSolde(){
        return this.solde;
    }
    public CompteCourant(String intitule, double solde, double montantDecouvertAutorise) {
        if(solde<0) {
            System.out.println("on ne peut créer un compte avec un solde négatif");
        }else{
            this.intitule = intitule;
            this.solde = solde;
            this.montantDecouvertAutorise = montantDecouvertAutorise;
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
