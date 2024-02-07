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
}
