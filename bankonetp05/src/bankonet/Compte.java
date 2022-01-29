package bankonet;

public abstract class Compte {
    private String numero;
    private String intitule;
    private double solde=0;

    public Compte(){

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


    public abstract boolean debitAutorise(double montant);

    public double getSolde(){
        return this.solde;
    }
    public Compte(String intitule, double solde) {
        if(solde<0) {
            System.out.println("on ne peut créer un compte avec un solde négatif");
        }else{
            this.intitule = intitule;
            this.solde = solde;
        }

    }

    public void crediter(double montant) throws Exception{
        if(creditAutorise(montant,10000)){
            this.solde+=montant;
        }else{
            throw new DebitException("on ne peut créditer votre compte de ce montant");
        }
    }

    public void debiter(double montant) throws DebitException {
        if(debitAutorise(montant)){
            this.solde-=montant;
        }else{
            throw new DebitException("on ne peut créer un compte avec un solde négatif");
        }

    }

    public abstract boolean creditAutorise(double Montant , double plafond);

    public void effectuerVirement(Compte compte,double montant){
         try{
             compte.debiter(montant);
             this.crediter(montant);
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
    }

    public String toString(){
        return "==================Numero de compte "+numero+"=============================================\n"+
                "Nom Compte : "+intitule+"\n"+
                "Solde votre compte : "+solde+"\n";
    }
}
