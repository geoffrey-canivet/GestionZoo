 public class Zoo {

    private String nom;
    private int visiteurMax;
    private int animauxMax;

    public Zoo(String nom, int visiteurMax, int animauxMax) {
        this.nom = nom;
        this.visiteurMax = visiteurMax;
        this.animauxMax = animauxMax;
    }

    public Zoo(){

    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVisiteurMax(int visiteurMax) {
        this.visiteurMax = visiteurMax;
    }

    public void setAnimauxMax(int animauxMax) {
        this.animauxMax = animauxMax;
    }

    // Getter
    public String getNom() {
        return nom;
    }

    public int getVisiteurMax() {
        return visiteurMax;
    }

    public int getAnimauxMax() {
        return animauxMax;
    }

}
