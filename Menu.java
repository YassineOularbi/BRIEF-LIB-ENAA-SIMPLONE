import java.util.Scanner;
class Menu {
    void InterfaceMenu () {
        System.out.println("+------------------------------------+");
        System.out.println("|       Gestion de Bibliothèque      |");
        System.out.println("+------------------------------------+");
        System.out.println("|      1. Accéder au livres.         |");
        System.out.println("|      2. Accéder au étudiant(e)s.   |");
        System.out.println("|      3. Effectuer une réservation. |");
        System.out.println("|      4. Quitter                    |");
        System.out.println("+------------------------------------+");
        System.out.print("          Entrez : ");
        int ChoixPrincipal = new Scanner(System.in).nextInt();
        switch(ChoixPrincipal){
            case 1 :
                InterfaceLivres();
                break;
            case 2 :
                InterfaceEtudiant();
                break;
            case 3 :
                break;
            case 4 :
                System.out.println("+------------------------------------+");
                System.out.println("|   A bientot, vous avez quitté !    |");
                System.out.println("+------------------------------------+");
                break;
            default:
                System.out.println("|      Entrez un choix valid !         |");
                InterfaceMenu();
                break;
        }

    }

    void InterfaceLivres(){
        System.out.println("+------------------------------------+");
        System.out.println("|         Interface Livres           |");
        System.out.println("+------------------------------------+");
        System.out.println("|      1. Ajouter un livre.          |");
        System.out.println("|      2. Modifier un livre.         |");
        System.out.println("|      3. Supprimer un livre.        |");
        System.out.println("|      4. Rechercher un livre.       |");
        System.out.println("|      5. Afficher les livres.       |");
        System.out.println("|      5. Afficher les Reservations. |");
        System.out.println("|      6. Returner à l'acceuil.      |");
        System.out.println("+------------------------------------+");
        System.out.print("          Entrez : ");
        Library POOLibrary = new Library();
        int ChoixLivre = new Scanner(System.in).nextInt();
        switch(ChoixLivre){
            case 1:
                POOLibrary.AddBook();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                InterfaceMenu();
                break;
            default:
                System.out.println("|      Entrez un choix valid !         |");
                InterfaceLivres();
                break;
        }
    } void InterfaceEtudiant(){
        System.out.println("+------------------------------------+");
        System.out.println("|        Interface Etudiant(e)s      |");
        System.out.println("+------------------------------------+");
        System.out.println("|      1. Ajouter un étudiant(e).    |");
        System.out.println("|      2. Modifier un étudiant(e).   |");
        System.out.println("|      3. Supprimer un étudiant(e).  |");
        System.out.println("|      4. Rechercher un étudiant(e). |");
        System.out.println("|      5. Afficher les apprenant(e)s.|");
        System.out.println("|      6. Returner à l'acceuil.      |");
        System.out.println("+------------------------------------+");
        System.out.print("          Entrez : ");
        int ChoixEtudiant = new Scanner(System.in).nextInt();
        switch(ChoixEtudiant){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                InterfaceMenu();
                break;
            default:
                System.out.println("|      Entrez un choix valid !         |");
                InterfaceEtudiant();
                break;
        }
    }
}
