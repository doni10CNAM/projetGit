package bankonet;

public class Client {

    private String identifiant;
    private String nom;
    private String prenom;
    private CompteCourant compteCourant;
    private CompteEpargne compteEpargne;

    public Client(String identifiant, String nom, String prenom, CompteCourant compteCourant,CompteEpargne compteEpargne){
         this.identifiant = identifiant;
         this.nom = nom;
         this.prenom = prenom;
         this.compteCourant = compteCourant;
         this.compteEpargne = compteEpargne;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }

    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }

    public double calculerAvoirGlobal(){
        double avoirGlobal = 0;
        if (this.compteCourant != null) {
            avoirGlobal += this.compteCourant.getSolde();
        }
        if(this.compteEpargne != null){
            avoirGlobal += this.compteEpargne.getSolde();
        }
        return avoirGlobal;
    }

    public String toString(){
        return "nom : "+this.nom+" / "+"prenom : "+this.prenom;
    }
}
