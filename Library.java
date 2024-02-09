import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Library {
    ArrayList<Book> ArrayBook = new ArrayList<Book>();
    ArrayList<Student> ArrayStudent = new ArrayList<Student>();
    ArrayList<Reservation> ArrayReservation = new ArrayList<Reservation>();
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
            String TitleModify = scanner.nextLine();
            for (int i =  0; i < ArrayBook.size(); i++) {
                if (ArrayBook.get(i).Title.equals(TitleModify)) {
                    ArrayBook.get(i).ModifyBook();
                    imodify = i;
                }
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
    void RemoveBook() {
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
            String RemoveTitle = scanner.nextLine();
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
                    System.out.println("-> Apprenant(e) :" + ArrayBook.get(i).Owner);
                    System.out.println("+------------------------------------+");
            }
        }
    }
    void AddStudent() {
        Student POOStudent = new Student();
        System.out.println("+------------------------------------+");
        System.out.println("|       Ajouter un étudiant(e)       |");
        System.out.println("+------------------------------------+");
        System.out.println("Entrez le nom d'étudiant(e) : ");
        POOStudent.Name = scanner.nextLine();
        System.out.println("Entrez l'adresse d'étudiant(e) : ");
        POOStudent.Address = scanner.nextLine();
        System.out.println("Entrez la numéro d'identification : ");
        POOStudent.Identification_Number = scanner.nextLine();
        System.out.println("Entrez la classe d'étudiant(e) : ");
        POOStudent.Classroom = scanner.nextLine();
        ArrayStudent.add(POOStudent);
        System.out.println("+------------------------------------+");
        System.out.println("|L'étudiant a été ajouté avec succes!|");
        System.out.println("+------------------------------------+");
    }
    void ModifyStudentLib(){
        int imodify = -1;
        if (ArrayStudent.isEmpty()) {
            System.out.println("+-------------------------------------+");
            System.out.println("|       La bibliothèque est vide.     |");
            System.out.println("|Aucun étudiant trouvé pour l'instant.|");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|     Modifier un(e) étudiant(e)     |");
            System.out.println("+------------------------------------+");
            System.out.println("Entrez le nom d'étudiant à modifier : ");
            String NameModify = scanner.nextLine();
            for (int i =  0; i < ArrayStudent.size(); i++) {
                if (ArrayStudent.get(i).Name.equals(NameModify)) {
                    ArrayStudent.get(i).ModifyStudent();
                    imodify = i;
                }
            }
            if (imodify == -1) {
                System.out.println("+------------------------------------+");
                System.out.println("|Cet étudiant(e) n'a pas été trouvé! |");
                System.out.println("+------------------------------------+");
            } else {
                System.out.println("+------------------------------------+");
                System.out.println("|L'étudiant a été modifié avec succes|");
                System.out.println("+------------------------------------+");
            }
        }
    }
    void RemoveStudent() {
        int iremove = -1;
        if (ArrayStudent.isEmpty()) {
            System.out.println("+-------------------------------------+");
            System.out.println("|       La bibliothèque est vide.     |");
            System.out.println("|Aucun étudiant trouvé pour l'instant.|");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|      Supprimer un étudiant(e)      |");
            System.out.println("+------------------------------------+");
            System.out.println("Entrez le nom d'étudiant à supprimer : ");
            String RemoveName = scanner.nextLine();
            for (int i = 0; i < ArrayStudent.size(); i++) {
                if (ArrayStudent.get(i).Name.equals(RemoveName)) {
                    iremove = i;
                }
            }
            if (iremove == -1) {
                System.out.println("+------------------------------------+");
                System.out.println("|Cet étudiant(e) n'a pas été trouvé! |");
                System.out.println("+------------------------------------+");
            } else {
                ArrayStudent.remove(iremove);
                System.out.println("+------------------------------------+");
                System.out.println("|étudiant a été supprimé avec succes!|");
                System.out.println("+------------------------------------+");
            }


        }
    }
    void SearchStudent () {
        int isearch = -1;
        if (ArrayStudent.isEmpty()) {
            System.out.println("+-------------------------------------+");
            System.out.println("|       La bibliothèque est vide.     |");
            System.out.println("|Aucun étudiant trouvé pour l'instant.|");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|    Rechercher un(e) étudiant(e)    |");
            System.out.println("+------------------------------------+");
            System.out.println("Entrez le nom d'étudiant à rechercher : ");
            String SearchName = scanner.nextLine();
            for (int i = 0; i < ArrayStudent.size(); i++) {
                if (ArrayStudent.get(i).Name.equals(SearchName)) {
                    isearch = i;
                }

            }
            if (isearch == -1) {
                System.out.println("+------------------------------------+");
                System.out.println("|Cet étudiant(e) n'a pas été trouvé! |");
                System.out.println("+------------------------------------+");
            } else {
                System.out.println("+-------| Etudiant(e) ID : " + (isearch + 1) + " |-------+");                System.out.println("-> Titre :" + ArrayBook.get(isearch).Title);
                System.out.println("-> Nom :" + ArrayStudent.get(isearch).Name);
                System.out.println("-> Adresse :" + ArrayStudent.get(isearch).Address);
                System.out.println("-> Numéro d'identification :" + ArrayStudent.get(isearch).Identification_Number);
                System.out.println("-> Classe :" + ArrayStudent.get(isearch).Classroom);
                System.out.println("+------------------------------------+");
            }
        }
    }
    void DisplayStudents () {
        if (ArrayStudent.isEmpty()) {
            System.out.println("+-------------------------------------+");
            System.out.println("|       La bibliothèque est vide.     |");
            System.out.println("|Aucun étudiant trouvé pour l'instant.|");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|      La liste des étudiant(e)s     |");
            System.out.println("+------------------------------------+");
            for (int i = 0; i < ArrayStudent.size(); i++) {
                System.out.println("+-------| Etudiant(e) ID : " + (i + 1) + " |-------+");
                System.out.println("-> Nom :" + ArrayStudent.get(i).Name);
                System.out.println("-> Adresse :" + ArrayStudent.get(i).Address);
                System.out.println("-> Numéro d'identification :" + ArrayStudent.get(i).Identification_Number);
                System.out.println("-> Classe :" + ArrayStudent.get(i).Classroom);
                System.out.println("-> Livre reservé :" + ArrayStudent.get(i).Owned_by);
                System.out.println("+------------------------------------+");
            }
        }
    }
    void AddReservation() {
        Reservation POOReservation = new Reservation();
        LocalDate currenteDate = LocalDate.now();
        if (ArrayBook.isEmpty()){
            System.out.println("+------------------------------------+");
            System.out.println("|      La bibliothèque est vide.     |");
            System.out.println("| Aucun livre trouvé pour l'instant. |");
            System.out.println("+------------------------------------+");
        } else if (ArrayStudent.isEmpty()){
            System.out.println("+-------------------------------------+");
            System.out.println("|       La bibliothèque est vide.     |");
            System.out.println("|Aucun étudiant trouvé pour l'instant.|");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|       Ajouter une réservation      |");
            System.out.println("+------------------------------------+");
            System.out.println("Entrez le nom d'étudiant qui reserve : ");
            String CheckStudentName = scanner.nextLine();
            for (int i = 0; i < ArrayBook.size(); i++){
                if (ArrayStudent.get(i).Name.equals(CheckStudentName)){
                    POOReservation.Student_Name = ArrayStudent.get(i).Name;
                    System.out.println("Entrez Le titre du livre à reserver : ");
                    String CheckBookName = scanner.nextLine();
                    if (ArrayBook.get(i).Title.equals(CheckBookName)){
                        POOReservation.Book_Name = ArrayBook.get(i).Title;
                        POOReservation.Date_Begin = currenteDate;
                        System.out.println("Entrez la date fin de réservation : ");
                        String FormatterDate = scanner.nextLine();
                        LocalDate FormatDate = LocalDate.parse(FormatterDate, DateTimeFormatter.ISO_DATE);
                        POOReservation.Date_End = FormatDate;
                        Student Owned_by = ArrayBook.get(i).Title;
                        ArrayBook.get(i).Owner = ArrayStudent.get(i).Name;
                        ArrayReservation.add(POOReservation);
                        System.out.println("+------------------------------------+");
                        System.out.println("|La réservation effuectée avec succes|");
                        System.out.println("+------------------------------------+");
                    } else {
                        System.out.println("+------------------------------------+");
                        System.out.println("|       Le livre n'existe pas!       |");
                        System.out.println("+------------------------------------+");
                    }
                    } else {
                    System.out.println("+------------------------------------+");
                    System.out.println("|      L'étudiant n'existe pas!      |");
                    System.out.println("+------------------------------------+");



                }

            }
        }

    }
    void DisplayReservations () {
        if (ArrayBook.isEmpty()) {
            System.out.println("+-------------------------------------+");
            System.out.println("|       La bibliothèque est vide.     |");
            System.out.println("|  Aucune réservation pour l'instant. |");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|      La liste des réservations     |");
            System.out.println("+------------------------------------+");
            for (int i = 0; i < ArrayReservation.size(); i++) {
                System.out.println("+-------| Réservation ID : " + (i + 1) + " |-------+");
                System.out.println("-> Nom d'apprenant :" + ArrayReservation.get(i).Student_Name);
                System.out.println("-> Titre de livre réservé :" + ArrayReservation.get(i).Book_Name);
                System.out.println("-> Date début de réservation :" + ArrayReservation.get(i).Date_Begin);
                System.out.println("-> Date fin de réservation :" + ArrayReservation.get(i).Date_End);
                System.out.println("+------------------------------------+");
            }
        }
    }
}



