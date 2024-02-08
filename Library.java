import java.util.ArrayList;
import java.util.Scanner;

class Library {
    ArrayList<Book> ArrayBook = new ArrayList<Book>();
    ArrayList<Student> ArrayStudent = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);

    void AddBook() {
        Book POOBook = new Book();
        System.out.println("+------------------------------------+");
        System.out.println("|          Ajouter un livre          |");
        System.out.println("+------------------------------------+");
        System.out.println("Entrez le titre du livre : ");
        POOBook.Title = scanner.nextLine();
        System.out.println("Entrez L'auteur du livre : ");
        POOBook.Author = scanner.nextLine();
        System.out.println("Entrez la date de publication du livre : ");
        POOBook.Publication_Date = scanner.nextLine();
        System.out.println("Entrez le numéro ISBN du livre : ");
        POOBook.ISBN_Number = scanner.nextLine();
        ArrayBook.add(POOBook);
        System.out.println("+------------------------------------+");
        System.out.println("| Le livre a été ajouté avec succes! |");
        System.out.println("+------------------------------------+");
    }

    void RemoveBook() {
        String RemoveTitle = scanner.nextLine();
        int iremove = -1;
        if (ArrayBook.isEmpty()) {
            System.out.println("+------------------------------------+");
            System.out.println("|      La bibliothèque est vide.     |");
            System.out.println("| Aucun livre trouvé pour l'instant. |");
            System.out.println("+------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|         Supprimer un livre         |");
            System.out.println("+------------------------------------+");
            System.out.println("Entrez le titre du livre à supprimer : ");
            for (int i = 0; i < ArrayBook.size(); i++) {
                if (ArrayBook.get(i).Title.equals(RemoveTitle)) {
                    iremove = i;
                }
            }
            if (iremove == -1) {
                System.out.println("+------------------------------------+");
                System.out.println("|     Ce livre n'a pas été trouvé    |");
                System.out.println("+------------------------------------+");
            } else {
                ArrayBook.remove(iremove);
                System.out.println("+------------------------------------+");
                System.out.println("|le livre a été supprimé avec succes!|");
                System.out.println("+------------------------------------+");
            }


        }
    }
    void SearchBook () {
        String SearchTitle;
        int isearch = -1;
        if (ArrayBook.isEmpty()) {
            System.out.println("+------------------------------------+");
            System.out.println("|      La bibliothèque est vide.     |");
            System.out.println("| Aucun livre trouvé pour l'instant. |");
            System.out.println("+------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|        Rechercher un livre         |");
            System.out.println("+------------------------------------+");
            System.out.println("Entrez le titre du livre à rechercher : ");
            SearchTitle = scanner.nextLine();
            for (int i = 0; i < ArrayBook.size(); i++) {
                if (ArrayBook.get(i).Title.equals(SearchTitle)) {
                   isearch = i;
                }

            }
            if (isearch == -1) {
                System.out.println("+------------------------------------+");
                System.out.println("|     Ce livre n'a pas été trouvé    |");
                System.out.println("+------------------------------------+");
            } else {
                System.out.println("+----------| Livre ID : " + (isearch + 1) + " |----------+");
                System.out.println("-> Titre :" + ArrayBook.get(isearch).Title);
                System.out.println("-> Auteur :" + ArrayBook.get(isearch).Author);
                System.out.println("-> Date de publication :" + ArrayBook.get(isearch).Publication_Date);
                System.out.println("-> Numéro ISBN :" + ArrayBook.get(isearch).ISBN_Number);
            }
        }
    }

    void ModifyBookLib(){
        int imodify = -1;
        if (ArrayBook.isEmpty()) {
            System.out.println("+------------------------------------+");
            System.out.println("|      La bibliothèque est vide.     |");
            System.out.println("| Aucun livre trouvé pour l'instant. |");
            System.out.println("+------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|         Modifier un livre          |");
            System.out.println("+------------------------------------+");
            System.out.println("Entrez le titre du livre à modifier : ");
            String TitleSearch = scanner.nextLine();
            for (int i =  0; i < ArrayBook.size(); i++) {
                if (ArrayBook.get(i).Title.equals(TitleSearch))
                ArrayBook.get(i).ModifyBook();
                imodify = i;
            }
            if (imodify == -1) {
                System.out.println("+------------------------------------+");
                System.out.println("|     Ce livre n'a pas été trouvé    |");
                System.out.println("+------------------------------------+");
            } else {
                System.out.println("+------------------------------------+");
                System.out.println("| Le livre a été modifié avec succes!|");
                System.out.println("+------------------------------------+");
            }
        }
    }
    void DisplayBooks () {
        if (ArrayBook.isEmpty()) {
                System.out.println("+------------------------------------+");
                System.out.println("|      La bibliothèque est vide.     |");
                System.out.println("| Aucun livre trouvé pour l'instant. |");
                System.out.println("+------------------------------------+");
        } else {
                System.out.println("+------------------------------------+");
                System.out.println("|        La liste des livres         |");
                System.out.println("+------------------------------------+");
            for (int i = 0; i < ArrayBook.size(); i++) {
                    System.out.println("+----------| Livre ID : " + (i + 1) + " |----------+");
                    System.out.println("-> Titre :" + ArrayBook.get(i).Title);
                    System.out.println("-> Auteur :" + ArrayBook.get(i).Author);
                    System.out.println("-> Date de publication :" + ArrayBook.get(i).Publication_Date);
                    System.out.println("-> Numéro ISBN :" + ArrayBook.get(i).ISBN_Number);
                    System.out.println("+------------------------------------+");
            }
        }
    }
}



