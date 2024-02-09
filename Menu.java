import java.util.Scanner;
class Menu {
    Library POOLibrary = new Library();
    Scanner scanner = new Scanner(System.in);
    void InterfaceMenu () {
        int ChoixPrincipal = 4;
        do
        {
            System.out.println("+------------------------------------+");
            System.out.println("|       Gestion de Bibliothèque      |");
            System.out.println("+------------------------------------+");
            System.out.println("|      1. Accéder au livres.         |");
            System.out.println("|      2. Accéder au étudiant(e)s.   |");
            System.out.println("|      3. Accéder au réservations.   |");
            System.out.println("|      4. Quitter                    |");
            System.out.println("+------------------------------------+");
            System.out.print("          Entrez : ");
            try {
                String input = scanner.nextLine();
                ChoixPrincipal = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("+------------------------------------+");
                System.out.println("|             Désolé !!!             |");
                System.out.println("|   Entrez un nombre entre 1 et 4 !  |");
                InterfaceMenu();
            }
            switch (ChoixPrincipal) {
                case 1:
                    InterfaceLivres();
                    break;
                case 2:
                    InterfaceEtudiant();
                    break;
                case 3:
                    InterfaceReservation();
                    break;
                case 4:
                    System.out.println("+------------------------------------+");
                    System.out.println("|   A bientot, vous avez quitté !    |");
                    System.out.println("+------------------------------------+");
                    break;
                default:
                    System.out.println("|      Entrez un choix valid !       |");
                    break;
            }
        }while(ChoixPrincipal != 4);
    }

    void InterfaceLivres(){
        int ChoixLivre = 6;
        do
        {
        System.out.println("+------------------------------------+");
        System.out.println("|         Interface Livres           |");
        System.out.println("+------------------------------------+");
        System.out.println("|      1. Ajouter un livre.          |");
        System.out.println("|      2. Modifier un livre.         |");
        System.out.println("|      3. Supprimer un livre.        |");
        System.out.println("|      4. Rechercher un livre.       |");
        System.out.println("|      5. Afficher les livres.       |");
        System.out.println("|      6. Returner à l'acceuil.      |");
        System.out.println("+------------------------------------+");
        System.out.print("          Entrez : ");
        try{
            String input = scanner.nextLine();
            ChoixLivre = Integer.parseInt(input);
        }catch (NumberFormatException e){
            System.out.println("+------------------------------------+");
            System.out.println("|             Désolé !!!             |");
            System.out.println("|   Entrez un nombre entre 1 et 6 !  |");
            InterfaceLivres();
        }
        switch(ChoixLivre){
            case 1:
                POOLibrary.AddBook();
                break;
            case 2:
                POOLibrary.ModifyBookLib();
                break;
            case 3:
                POOLibrary.RemoveBook();
                break;
            case 4:
                POOLibrary.SearchBook();
                break;
            case 5:
                POOLibrary.DisplayBooks();
                break;
            case 6 :
                InterfaceMenu();
                break;
            default:
                System.out.println("|      Entrez un choix valid !       |");
                break;
        }
        }while (ChoixLivre != 6);
    }
    void InterfaceEtudiant(){
        int ChoixEtudiant = 6;
        do {
            System.out.println("+------------------------------------+");
            System.out.println("|        Interface Etudiant(e)s      |");
            System.out.println("+------------------------------------+");
            System.out.println("|      1. Ajouter un étudiant(e).    |");
            System.out.println("|      2. Modifier un étudiant(e).   |");
            System.out.println("|      3. Supprimer un étudiant(e).  |");
            System.out.println("|      4. Rechercher un étudiant(e). |");
            System.out.println("|      5. Afficher les étudiant(e)S. |");
            System.out.println("|      6. Returner à l'acceuil.      |");
            System.out.println("+------------------------------------+");
            System.out.print("          Entrez : ");
            try{
                String inputTry = scanner.nextLine();
                ChoixEtudiant = Integer.parseInt(inputTry);
            }catch (NumberFormatException e){
            System.out.println("+------------------------------------+");
            System.out.println("|             Désolé !!!             |");
            System.out.println("|   Entrez un nombre entre 1 et 6 !  |");
            InterfaceEtudiant();
            }
            switch (ChoixEtudiant) {
                case 1:
                    POOLibrary.AddStudent();
                    break;
                case 2:
                    POOLibrary.ModifyStudentLib();
                    break;
                case 3:
                    POOLibrary.RemoveStudent();
                    break;
                case 4:
                    POOLibrary.SearchStudent();
                    break;
                case 5:
                    POOLibrary.DisplayStudents();
                    break;
                case 6 :
                    InterfaceMenu();
                    break;
                default:
                    System.out.println("|      Entrez un choix valid !       |");
                    break;
            }
        }while (ChoixEtudiant != 6);
    }
    void InterfaceReservation (){
        int ChoixReservation = 0;
        do {
            System.out.println("+------------------------------------+");
            System.out.println("|      Interface de Réservations     |");
            System.out.println("+------------------------------------+");
            System.out.println("|      1. Effectuer une réservation. |");
            System.out.println("|      2. Modifier une réservation.  |");
            System.out.println("|      3. Supprimer une réservation. |");
            System.out.println("|      4. Rechercher une réservation.|");
            System.out.println("|      5. Afficher les réservations. |");
            System.out.println("|      5. Alerte de réservation.     |");
            System.out.println("|      7. Returner à l'acceuil.      |");
            System.out.println("+------------------------------------+");
            System.out.print("          Entrez : ");
            try{
                String inputTry = scanner.nextLine();
                ChoixReservation = Integer.parseInt(inputTry);
            }catch (NumberFormatException e){
                System.out.println("+------------------------------------+");
                System.out.println("|             Désolé !!!             |");
                System.out.println("|   Entrez un nombre entre 1 et 6 !  |");
                InterfaceReservation();
            }
            switch (ChoixReservation) {
                case 1:
                    POOLibrary.AddReservation();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    POOLibrary.DisplayReservations();
                    break;
                case 6 :
                    break;
                case 7 :
                    InterfaceMenu();
                    break;
                default:
                    System.out.println("|      Entrez un choix valid !       |");
                    break;
            }
        }while (ChoixReservation != 7);
    }
}
