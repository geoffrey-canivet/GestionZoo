public class Requin extends Animal {
    int nbDents;
    int vitesse;

    public Requin(String nom, int age, String sexe,String regime, boolean isFed, int nbDents, int vitesse){
        super(nom, age, sexe, regime, false);
        this.nbDents = nbDents;
        this.vitesse = vitesse;
    }

    @Override // reecrit override Animal
    public String toString() {
        return "Requin -> Nom: " + nom + ", Age: " + age + ", Sexe: " + sexe + ", Régime: " + regime + ", Nb dents: " + nbDents + ", Km/h: " + vitesse + ", Nourri: " + isFed;
    }




}
