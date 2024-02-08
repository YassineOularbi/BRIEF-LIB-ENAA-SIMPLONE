import java.util.ArrayList;
import java.util.Scanner;

class Library {
    ArrayList<Book> ArrayBook = new ArrayList<Book>();
    ArrayList<Student> ArrayStudent = new ArrayList<Student>();
    void AddBook (){
        Book POOBook = new Book();
        System.out.println("+------------------------------------+");
        System.out.println("Entrez le titre du livre : ");
        POOBook.Title = new Scanner(System.in).nextLine();
        System.out.println("Entrez L'auteur du livre : ");
        POOBook.Author = new Scanner(System.in).nextLine();
        System.out.println("Entrez la date de publication du livre : ");
        POOBook.Publication_Date = new Scanner(System.in).nextLine();
        System.out.println("Entrez le numéro ISBN du livre : ");
        POOBook.ISBN_Number = new Scanner(System.in).nextLine();
        ArrayBook.add(POOBook);
        System.out.println("+------------------------------------+");
        System.out.println("| Le livre a été ajouté avec succes! |");
        System.out.println("+------------------------------------+");
    }
    void DisplayBooks() {
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
                System.out.println("+----------| Livre ID : " + ArrayBook.get(i).ID + "|-----------+");
                System.out.println("-> Titre :" + ArrayBook.get(i).Title);
                System.out.println("-> Auteur :" + ArrayBook.get(i).Author);
                System.out.println("-> Date de publication :" + ArrayBook.get(i).Publication_Date);
                System.out.println("-> Numéro ISBN :" + ArrayBook.get(i).ISBN_Number);
                System.out.println("+------------------------------------+");
                ArrayBook.get(i).ID++;
            }
        }
    }

}


