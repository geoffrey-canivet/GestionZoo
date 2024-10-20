import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Gestion {
    Scanner scanner = new Scanner(System.in);
    String border2 = "+=========================================+";

    // Variable
    Map<String, Animal> animalMap = new HashMap<>(); // CLE: Nom de l'animal // VALEUR objet de l'animal - utile pour retrouver un animal par son nom
    int nbRequin = 0;
    int nbLion = 0;
    int nbAigle = 0;
    String nomZoo;
    int visiteurMAX;
    int animauxMAX;
    boolean continuerAj = true; // BUG
    boolean continuerSup = true; // BUG

    // Creer un zoo
    public void creerZoo(Zoo monZoo){

        System.out.println("Donnez un nom a votre zoo:");
        nomZoo = scanner.nextLine();
        System.out.println("Donnez un nombre maximum de visiteur:");
//        verifUserChoiceInt();
        visiteurMAX = scanner.nextInt();
        System.out.println("Donnez un nombre maximum d'animaux':");
        animauxMAX = scanner.nextInt();
//        verifUserChoiceInt();

        // modifier parametres existant // surcharger
        monZoo.setNom(nomZoo);
        monZoo.setVisiteurMax(visiteurMAX);
        monZoo.setAnimauxMax(animauxMAX);

        System.out.println(border2);
        System.out.println("Bienvenue dans votre nouveau zoo.");
        System.out.println("Il est temps d'héberger des");
        System.out.println("animaux et d'accueillir des visireurs !");
        System.out.println("appuyez sur ENTER");
        System.out.println(border2);
        menuPrincipal(monZoo);
    }

    // Menu principale
    public void menuPrincipal(Zoo monZoo) {
        System.out.println();
        System.out.println(border2);
        System.out.println("| Menu Principal                          |");
        System.out.println(border2);
        System.out.println("O - Afficher les infos");
        System.out.println("1 - Ajouter/supprimer des animaux");
        System.out.println("2 - Nourrir les animaux");
        System.out.println("3 - Activer des attractions");
        System.out.println("4 - Gestion des visiteurs");
        System.out.println("5 - Quitter");
        System.out.println(border2);

        System.out.println("Votre choix : ");
//        verifUserChoiceInt();

        switch (scanner.nextInt()) {
            case 0:
                infos(monZoo);
                break;
            case 1:
                menuAjoutSupAnimal(monZoo);
                break;
            case 2:
                nourrir(monZoo);
                break;
            case 3:
                System.out.println("Activer des attractions");
                break;
            case 4:
                System.out.println("Faire venir des visiteurs");
                break;
            default:
                System.out.println("Erreur !! il n'y a pas d'option -> " + scanner.nextInt());
                menuPrincipal(monZoo);
                break;
        }
    }

    // Afficher les infos
    public void infos(Zoo monZoo){
        System.out.println(border2);
        System.out.println("| Info zoo               |");
        System.out.println(border2);
        System.out.println("- Nom du zoo : " + monZoo.getNom());
        System.out.println("- Visiteur max : " + monZoo.getVisiteurMax());
        System.out.println("- Visiteur actuellement : ");
        System.out.println("- Animaux max : " + monZoo.getAnimauxMax());
        System.out.println("- Animaux actuellement : " + animalMap.size());
        System.out.println(border2);
        System.out.println("| Info animaux               |");
        System.out.println(border2);
        int index = 1;
        for(String key : animalMap.keySet()){
            System.out.println(index + " - " + animalMap.get(key));
            index++;
        }
        System.out.println(border2);
        System.out.println("0 - Menu principal");
        System.out.println("votre choix :");
        if (scanner.nextInt() == 0){
            menuPrincipal(monZoo);
        } else {
            System.out.println("0 - Menu principal");
        }
    }

    // Ajouter et supprimer animaux
    public void menuAjoutSupAnimal(Zoo monZoo) {
        System.out.println(border2);
        System.out.println("| Menu Ajout et suppression               |");
        System.out.println(border2);
        System.out.println("O - Ajouter des animaux");
        System.out.println("1 - Supprimer des animaux");
        System.out.println("2 - Menu principal");
        System.out.println(border2);
        System.out.println();
        System.out.println("Votre choix : ");
        int userChoicePrincipal = scanner.nextInt();
        scanner.nextLine(); // consommer pour liberer input
        switch (userChoicePrincipal) {
            // Menu ajouter animaux
            case 0:
                System.out.println(border2);
                System.out.println("| Menu Ajouter un animal               |");
                System.out.println(border2);
                System.out.println("O - Ajouter un lion");
                System.out.println("1 - Ajouter un aigle");
                System.out.println("2 - Ajouter un Requin");
                System.out.println("3 - Menu principal");
                System.out.println(border2);
                System.out.println();
                System.out.println("Votre choix : ");

                // Ajouter animaux
                switch (scanner.nextInt()) {
                    // Ajouter un lion.
                    case 0:
                        do {
                            String nameLion = "Lion";
                            Lion lion = new Lion(nameLion + nbLion, 35, "male", "carnivor", false, "feroce", "jaune");
                            animalMap.put(lion.nom, lion);
                            nbLion++;
                            System.out.println("Ajouter un autre lion? 0/1");
                            if (scanner.nextInt() == 1) {
                                continuerAj = true;
                            } else {
                                continuerAj = false;
                                menuAjoutSupAnimal(monZoo);
                            }
                        } while (continuerAj);
                        menuAjoutSupAnimal(monZoo);
                        break;
                    // ajouter Aigle
                    case 1:
                        do {
                            String nameAigle = "Aigle";
                            Aigle aigle = new Aigle(nameAigle + nbAigle, 35, "male", "carnivor", false, "douces", 500);
                            animalMap.put(aigle.nom, aigle);
                            nbAigle++;
                            System.out.println("Ajouter un autre Aigle? 0/1");
                            if (scanner.nextInt() == 1) {
                                continuerAj = true;
                            } else {
                                continuerAj = false;
                                menuPrincipal(monZoo);
                            }
                        } while (continuerAj);
                        menuAjoutSupAnimal(monZoo);
                        break;
                    // ajouter Requin
                    case 2:
                        do {
                            String nameRequin = "Requin";
                            Requin requin = new Requin(nameRequin + nbRequin, 12, "male", "poisson", false,  99, 150);
                            animalMap.put(requin.nom, requin);
                            nbRequin++;
                            System.out.println("Ajouter un autre Requin? 0/1");
                            if (scanner.nextInt() == 1) {
                                continuerAj = true;
                            } else {
                                continuerAj = false;
                                menuAjoutSupAnimal(monZoo);
                            }
                        } while (continuerAj);
                        menuAjoutSupAnimal(monZoo);
                    case 3:
                        menuPrincipal(monZoo);
                        break;
                    default:
                        System.out.println("Erreur !! -> " + scanner.nextInt());
                        break;
                }
                break;
            // Supprimer animaux
            case 1:
                System.out.println(border2);
                System.out.println("| Menu supprimer               |");
                System.out.println(border2);


                    do {
                        System.out.println("Entrez le nom d'un animal pour le supprimer");
                        System.out.println("Votre choix: ");
                        String userChoice = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("votre choix est: " + userChoice);
                        animalMap.remove(userChoice);
                        System.out.println("Supprimer un autre animal? 0/1");/////////////////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

                        if (scanner.nextInt() == 1) {
                            continuerAj = true;
                        } else {
                            continuerAj = false;
                            menuAjoutSupAnimal(monZoo);
                        }
                    } while (continuerSup);






                break;
            // Retour au menu principal
            case 2:
                menuPrincipal(monZoo);
                break;
            default:
                System.out.println("Erreur");
                break;
        }
    }

    // Nourrir les animaux
    public void nourrir(Zoo monZoo){
        System.out.println("Entrez le nom d'un animal pour le nourrir");
        System.out.println("Votre choix: ");
        scanner.nextLine();
        String userChoice = scanner.nextLine();
        for(String key : animalMap.keySet()){
            if (key.equals(userChoice)){
                System.out.println("nourrir l'animal");
                animalMap.get(key).isFed = true;
                menuPrincipal(monZoo);
            } else {
                System.out.println("animal inconnu");
                nourrir(monZoo);
            }
        }
    }

    // empecher entrée string si int
    public void verifUserChoiceInt(){
        while (!scanner.hasNextInt()) {
            System.out.println("Erreur !!");
            scanner.next();  // On vide l'entrée incorrecte
            System.out.print("Votre choix : ");
        }
    }

}
