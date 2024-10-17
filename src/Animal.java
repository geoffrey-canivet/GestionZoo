

public class Animal {
     String nom;
     int age;
     String sexe;
     String regime;
     boolean isFed = false;

    public Animal(String nom, int age, String sexe, String regime, boolean isFed){
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.regime = regime;
        this.isFed = isFed;
    }



    @Override
    public String toString() {
        return "class Animal -> " + nom + " " + age + " " + sexe + " " + regime ;
    }
}
