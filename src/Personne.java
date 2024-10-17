public class Personne {
    String nom;
    int age;
    String sexe;

    public Personne(String nom, int age, String sexe) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
    }

    @Override
    public String toString(){
        return "class Zoo -> " + nom + " " + age + " " + sexe;
    }
}
