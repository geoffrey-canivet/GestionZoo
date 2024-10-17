public class Aigle extends Animal{
    String plume;
    int hauteurVol;

    public Aigle(String nom, int age, String sexe, String regime, boolean isFed, String plume, int hauteurVol) {
        super(nom, age, sexe, regime, isFed);
        this.plume = plume;
        this.hauteurVol = hauteurVol;
    }

    @Override // reecrit override Animal
    public String toString() {
        return "Aigle -> Nom: " + nom + ", Age: " + age + ", Sexe: " + sexe + ", Régime: " + regime + ", Plume: " + plume + ", Hauteur de vol: " + hauteurVol + ", nourri: " + isFed;
    }
}
