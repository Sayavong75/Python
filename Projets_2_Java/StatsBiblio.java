import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;


public class StatsBiblio {
    public static void main(String[] args) throws FileNotFoundException {

        //--------------------------------------------------------------------------------------------------------------
        // Création de la liste des fichiers du répertoire BookSources avant la boucle
        ArrayList<String> listBooks = new ArrayList<String>();
        File folder = new File("./BooksSources");
        String[] list = folder.list();
        for (String file : list) {
            listBooks.add(file);
        }
        //--------------------------------------------------------------------------------------------------------------
        boolean loopMainMenu = true;
        do { // Boucle pour revenir sur le menu principal

            Scanner sc = new Scanner(System.in);
            ArrayList<String> listMainMenu = new ArrayList<String>();
            ArrayList<String> listSubMenu = new ArrayList<String>();

            /* Création du titre du menu principal avec la fonction repeat pour répéter des chaînes de caractères
             * Alignement au centre du titre MENU PRINCIPAL avec la classe center */
            String str = "-";
            String repeated = str.repeat(45); // Répétition de caractère pour afficher un séparateur de ligne dans la console de commande

            String TitleMainMenu = "MENU PRINCIPAL";
            System.out.println(repeated);
            String centerTitleMainMenu = Center(TitleMainMenu, 45); // Alignement Center pour le titre du menu principal
            System.out.println(centerTitleMainMenu);
            System.out.println(repeated);
            //----------------------------------------------------------------------------------------------------------
            /* Création du menu principal par ArrayList
             * Ajout des textes d'option dans l'ArrayList
             * Affichage des options de menu dans la console par ligne */
            listMainMenu.add("1. Lister les fichiers");
            listMainMenu.add("2. Ajouter un fichier");
            listMainMenu.add("3. Supprimer un fichier");
            listMainMenu.add("4. Afficher des informations sur un livre");
            listMainMenu.add("5. Quitter le programme");
            for (String s : listMainMenu) {
                System.out.println(s);
            }
            System.out.println(repeated);
            //----------------------------------------------------------------------------------------------------------
            /* Saisie de l'entrée de donnée (option du menu principal)
             * Vérification si la saisie est une valeur numérique comprise entre 1 et 5
             * ATTENTION : Pas de gestion des saisies nulles ou espaces vides (car je n'ai pas trouvé la méthode...) */
            Integer numChoice;
            do {
                System.out.print("Entrez le numéro de votre choix : ");
                while (!sc.hasNextInt()) { // Boucle tant que la valeur n'est pas un entier
                    System.out.print("Vous n'avez pas saisi un numéro ! Réessayez : ");
                    sc.next(); // this is important!
                }
                numChoice = sc.nextInt(); // La valeur valeur valide est mis dans la variable numChoice
            } while (numChoice < 1 || numChoice > 5); // Boucle tant que la prochaine entrée n'est pas dans l'intervalle entre 1 et 5
            System.out.println(repeated);
            //----------------------------------------------------------------------------------------------------------
            // Exécution des options du menu principal
            switch (numChoice) {
                case 1: // Option 1: Lister les fichiers
                    // Affiche la liste des fichiers du répertoire BookSources
                    for (String s : listBooks) {
                        System.out.println(s);
                    }
                    sc.nextLine(); // Consomme le retour chariot de la ligne
                    break;
                case 2: // Option 2: Ajouter un fichier
                    System.out.println("Entrez le nom du fichier à ajouter : ");
                    sc.nextLine(); // Consomme le retour chariot de la ligne
                    String addFile = sc.nextLine();
                    listBooks.add(addFile);
                    Collections.sort(listBooks);
                    System.out.println("Le fichier " + addFile + " a été ajouté");
                    break;
                case 3: // Option 3: Supprimer un fichier
                    // Affichage de la liste des fichiers disponibles et sélection par numéro
                    int maxDel = listBooks.size();
                    for (int i = 0; i < maxDel; i++) {
                        System.out.println(i + 1 + " - " + listBooks.get(i));
                    }
                    System.out.println(repeated);
                    // Vérification si la saisie est une valeur numérique comprise entre 1 et le max affiché
                    Integer numDel;
                    do {
                        System.out.print("Entrez le numéro du fichier à supprimer : ");
                        while (!sc.hasNextInt()) { // Boucle tant que la valeur n'est pas un entier
                            System.out.print("Vous n'avez pas saisi un numéro ! Réessayez : ");
                            sc.next(); // this is important!
                        }
                        numDel = sc.nextInt(); // La valeur valeur valide est mis dans la variable numChoice
                    } while (numDel < 1 || numDel > maxDel); // Boucle tant que la prochaine entrée n'est pas dans l'intervalle entre 1 et le max affiché
                    String nameDel = listBooks.get(numDel - 1);
                    listBooks.remove(numDel - 1);
                    System.out.println("Le fichier " + nameDel + " a été supprimé");
                    sc.nextLine(); // Consomme le retour chariot de la ligne
                    break;
                case 4: // Option 4: Afficher des informations sur un livre
                    // Affichage de la liste des fichiers disponibles et sélection par numéro
                    int maxDisplay = listBooks.size();
                    for (int i = 0; i < maxDisplay; i++) {
                        System.out.println(i + 1 + " - " + listBooks.get(i));
                    }
                    System.out.println(repeated);
                    // Vérification si la saisie est une valeur numérique comprise entre 1 et le max affiché
                    Integer numDisplay;
                    do {
                        System.out.print("Entrez le numéro du fichier à afficher : ");
                        while (!sc.hasNextInt()) { // Boucle tant que la valeur n'est pas un entier
                            System.out.print("Vous n'avez pas saisi un numéro ! Réessayez : ");
                            sc.next(); // this is important!
                        }
                        numDisplay = sc.nextInt(); // La valeur valeur valide est mis dans la variable numChoice
                    } while (numDisplay < 1 || numDisplay > maxDisplay); // Boucle tant que la prochaine entrée n'est pas dans l'intervalle entre 1 et le max affiché

                    String nameDisplay = listBooks.get(numDisplay - 1); // Création d'une variable pour mémoriser le nom du fichier selectionné
                    //--------------------------------------------------------------------------------------------------
                    /* Création du sous-menu affichage fichier par ArrayList
                     * Ajout des textes d'option dans l'ArrayList
                     * Affichage des options du sous-menu dans la console par ligne */
                    System.out.println("Lecture du fichier sélectionné : " + nameDisplay);
                    System.out.println(repeated);
                    listSubMenu.add("1. Afficher le nombre de lignes du fichier");
                    listSubMenu.add("2. Afficher le nombre de mots du fichier");
                    listSubMenu.add("3. Afficher les 50 mots les plus fréquents et leur nombre d'occurrences");
                    for (String s : listSubMenu) {
                        System.out.println(s);
                    }
                    //--------------------------------------------------------------------------------------------------
                    // Lecture du fichier sélectionné depuis le répertoire enfant BookSources
                    ArrayList<String> myWordList = new ArrayList<String>();
                    Scanner scFile = null;
                    scFile = new Scanner(new File("./BooksSources/" + nameDisplay));
                    while (scFile.hasNextLine()) {
                        myWordList.add(scFile.nextLine());
                    }
                    scFile.close();
                    //--------------------------------------------------------------------------------------------------
                    /* Création d'une liste de valeurs uniques du fichier (utilisation de la collection HashSet)
                     * qui ne permet pas l'ajout de doublons */
                    Set<String> uniqueValues = new HashSet<String>(myWordList);
                    //--------------------------------------------------------------------------------------------------
                    /* Création d'une liste de valeurs uniques (utilisation de la classe HashMap et de la méthode frequency)
                     * avec clé:mot et valeur:nombre d'occurences */
                    HashMap<String, Integer> countWordList = new HashMap<>();
                    for (String temp : uniqueValues) {
                        int frequence = Collections.frequency(myWordList, temp);
                        countWordList.put(temp, frequence);
                        // System.out.println("fréquence("+temp+"): "+frequence);
                    }
                    //--------------------------------------------------------------------------------------------------
                    // Saisie de l'entrée de donnée (option du sous-menu)
                    int numSubChoice = sc.nextInt();

                    // Exécution des options du sous-menu de l'option 4
                    switch (numSubChoice) {
                        case 1: // Option 1: Afficher le nombre de lignes du fichier
                            // Affiche la nombre de lignes du fichier du répertoire BookSources
                            System.out.println("Nombre de lignes dans le fichier " + nameDisplay + "  : "
                                    + myWordList.size());
                            sc.nextLine(); // Calage retour chariot
                            break;
                        case 2: // Option 2: Afficher le nombre de mots du fichier
                            System.out.println("Nombre de mots uniques dans le fichier " + nameDisplay + "  : "
                                    + uniqueValues.size());
                            sc.nextLine(); // Consomme le retour chariot de la ligne
                            break;
                        case 3: // Option 3: afficher les 50 mots les plus fréquents et leur nombre d'occurrences
                            /* Recherche des 50 mots les plus utilisés
                             * Utilisation d'une méthode triAvecValeur */
                            // System.out.println("Avant le tri: "+countWordList);
                            // System.out.println("Après le tri: "+triAvecValeur(countWordList));
                            int sizeList = triAvecValeur(countWordList).size();
                            // Création d'une 1ère liste pour récupérer la liste des mots triés (keys)
                            // Création d'une 2ème liste pour récupérer la liste du nombre d'occurences des mots triés (values)
                            List<String> listKey = new ArrayList<String>(triAvecValeur(countWordList).keySet());
                            List<Integer> listValues = new ArrayList<Integer>(triAvecValeur(countWordList).values());
                            // System.out.println(listKey);
                            // System.out.println(listValues);
                            for (int i = sizeList - 50; i <= sizeList - 1; i++) {
                                System.out.println("top " + (sizeList - i) + " - le mot '" + listKey.get(i)
                                        + " 'apparaît " + listValues.get(i) + " fois");
                            }
                            sc.nextLine(); // Consomme le retour chariot de la ligne
                            break;
                        default:
                            System.out.println("Command not recognized!");
                            sc.nextLine(); // Consomme le retour chariot de la ligne
                    }
//                    sc.nextLine(); // Consomme le retour chariot de la ligne
                    break;
                case 5: // Option 5: Quitter le programme
                    System.out.print("A très bientôt :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Command not recognized!");
                    sc.nextLine(); // Consomme le retour chariot de la ligne
            }
            //----------------------------------------------------------------------------------------------------------
            /* Message pour mettre en pause l'action précédente
             * Reprise par touche clavier */
            System.out.println(repeated);
            System.out.println("Appuyez sur Entrée pour continuer");
            sc.nextLine();

        } while (loopMainMenu == true);
    }

    //------------------------------------------------------------------------------------------------------------------
    // Description : Fonction pour aligner au centre une chaine de caractères
    public static String Center(String s, int size) {
        return Center(s, size, ' ');
    }

    public static String Center(String s, int size, char pad) {
        if (s == null || size <= s.length())
            return s;

        // Utilisation de la classe StringBuilder pour créer une chaîne de caractères mutable (variable)
        StringBuilder sb = new StringBuilder(size);
        /* Construction de la partie gauche de la chaîne de caractères
         * Calcul (longueur string voulu - longueur titre) / 2
         * Ajout du pad (caractère de remplissage) par une boucle sur la longueur de la partie gauche
         */
        for (int i = 0; i < (size - s.length()) / 2; i++) {
            sb.append(pad);
        }
        sb.append(s); // Ajout du titre
        /* Construction de la partie droite de la chaine de caractères sur la longueur restante après ajout du titre
         * et de la partie droite
         */
        while (sb.length() < size) {
            sb.append(pad);
        }
        return sb.toString();
    }
    /*------------------------------------------------------------------------------------------------------------------
     * Description : Fonction de tri d'une liste HashMap par valeur
     * utilisation de la classe HashMap de la classe LinkedList, des méthodes compare et comparteTo */
    public static HashMap<String, Integer> triAvecValeur(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> map_apres = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list)
            map_apres.put(entry.getKey(), entry.getValue());
        return map_apres;
    }

//----------------------------------------------------------------------------------------------------------------------
}