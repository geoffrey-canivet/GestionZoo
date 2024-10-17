public class Visiteur extends Personne {
    int nbVisite;
    boolean reservation;

    public Visiteur(String nom, int age, String sexe, int nbVisite, boolean reservation) {
        super(nom, age, sexe);
        this.nbVisite = nbVisite;
        this.reservation = reservation;
    }
}
