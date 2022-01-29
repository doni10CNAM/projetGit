package bankonet;

public class CompteEpargne extends Compte{

    private double tauxInteret;

    public CompteEpargne(){
        super();
    }

    public double getTauxInteret(){
        return this.tauxInteret;
    }
    public void setTauxInteret(double tauxInteret){
        this.tauxInteret = tauxInteret;
    }


    public CompteEpargne(String intitule, double solde, double tauxInteret) {
        super(intitule,solde);
        if(solde>0) {
            this.tauxInteret = tauxInteret;
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
        if(this.getSolde()-montant<0){
            return false;
        }else{
            return true;
        }
    }
    @Override
    public String toString() {
        return  super.toString()+
                "Type Compte : Compte epargne\n"+
                "taux d'interet : "+tauxInteret+"\n"+
                "==========================================================================================";

    }

}
