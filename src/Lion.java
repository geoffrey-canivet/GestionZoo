public class Lion extends Animal {
    String rugissement;
    String couleur;


    public Lion(String nom, int age, String sexe, String regime, boolean isFed, String rugissement, String couleur) {
        super(nom, age, sexe, regime, false);
        this.rugissement = rugissement;
        this.couleur = couleur;
    }

    @Override // reecrit override Animal
    public String toString() {
        return "Lion -> Nom: " + nom + ", Age: " + age + ", Sexe: " + sexe + ", Régime: " + regime + ", Rugissement: " + rugissement + ", crinière: " + couleur + ", Nourri: " + isFed;
    }
}


