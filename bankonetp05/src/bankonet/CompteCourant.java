package bankonet;

public final class CompteCourant extends Compte{


    private double montantDecouvertAutorise;

    public CompteCourant(){
        super();
    }


    public double getMontantDecouvertAutorise(){
        return this.montantDecouvertAutorise;
    }
    public void setMontantDecouvertAutorise(double montantDecouvertAutorise){
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }


    public CompteCourant(String intitule, double solde, double montantDecouvertAutorise) {
        super(intitule,solde);
        if(solde>0) {
            this.montantDecouvertAutorise = montantDecouvertAutorise;
        }

    }

    public boolean creditAutorise(double montant, double plafond) {
        if(this.getSolde()+montant<plafond){
            return true;
        }else{
            return false;
        }
    }

    public boolean debitAutorise(double montant) {
        if(this.getSolde()-montant<-this.montantDecouvertAutorise){
             return false;
        }else{
             return true;
        }
    }

    public String toString() {
        return  super.toString()+
                "Type Compte : Compte Courant\n"+
                "montant decouvert autorisé : "+montantDecouvertAutorise+"\n"+
                "==========================================================================================";

    }
}
