import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
                            ArrayBook.get(i).Booked = false;
                            ArrayBook.get(i).Owner = null;
                            ArrayStudent.get(i).Owned_by.remove(ArrayBook.get(i));
                            ArrayReservation.remove(i);
                            ArrayReservation.get(i).WarningReservation = false;
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
                if(ArrayBook.get(isearch).Booked){
                    System.out.println("-> Le livre est reservé par ->");
                    System.out.println("\t- Nom :"+ArrayBook.get(isearch).Owner.Name);
                    System.out.println("\t- Adresse :"+ArrayBook.get(isearch).Owner.Address);
                    System.out.println("\t- Némuro d'identification :"+ArrayBook.get(isearch).Owner.Identification_Number);
                    System.out.println("\t- Classe :"+ArrayBook.get(isearch).Owner.Classroom);
                    if (ArrayReservation.get(isearch).WarningReservation){
                        System.out.println("Alert : le livre "+ArrayReservation.get(isearch).Book_Reservation.Title+" resérvé par "+ArrayReservation.get(isearch).Student_Reservation.Name+" doit retourner en "+ArrayReservation.get(isearch).Date_End);
                    }
                } else {
                    System.out.println("+------------------------------------+");
                    System.out.println("|Le livre est disponible pour reservé|");
                    System.out.println("+------------------------------------+");
                }
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

                    if(ArrayBook.get(i).Booked){
                        System.out.println("-> Le livre est reservé par ->");
                        System.out.println("\t- Nom :"+ArrayBook.get(i).Owner.Name);
                        System.out.println("\t- Adresse :"+ArrayBook.get(i).Owner.Address);
                        System.out.println("\t- Némuro d'identification :"+ArrayBook.get(i).Owner.Identification_Number);
                        System.out.println("\t- Classe :"+ArrayBook.get(i).Owner.Classroom);
                        if (ArrayReservation.get(i).WarningReservation){
                            System.out.println("Alert : le livre "+ArrayReservation.get(i).Book_Reservation.Title+" resérvé par "+ArrayReservation.get(i).Student_Reservation.Name+" doit retourner en "+ArrayReservation.get(i).Date_End);
                        }
                    } else {
                        System.out.println("+------------------------------------+");
                        System.out.println("|Le livre est disponible pour reservé|");
                        System.out.println("+------------------------------------+");
                    }
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
                    ArrayBook.get(i).Booked = false;
                    ArrayBook.get(i).Owner = null;
                    ArrayStudent.get(i).Owned_by.remove(ArrayBook.get(i));
                    ArrayReservation.remove(i);
                    ArrayReservation.get(i).WarningReservation = false;
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
                if (ArrayStudent.get(isearch).Owned_by.isEmpty()){
                    System.out.println("+------------------------------------+");
                    System.out.println("|    L'étudiant n'a jamais réservé   |");
                    System.out.println("+------------------------------------+");
                } else {
                    int ireserve = isearch;
                    System.out.println("-> Livres reservés :");
                    for (int j = 0; j<ArrayStudent.get(ireserve).Owned_by.size(); j++) {
                        System.out.println("\t- Livre " + (j+1) +" :" + ArrayStudent.get(ireserve).Owned_by.get(j).Title);
                    }
                    if (ArrayReservation.get(isearch).WarningReservation){
                        System.out.println("Alert : le livre "+ArrayReservation.get(isearch).Book_Reservation.Title+" resérvé par "+ArrayReservation.get(isearch).Student_Reservation.Name+" doit retourner en "+ArrayReservation.get(isearch).Date_End);
                    }
                }
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

                if (ArrayStudent.get(i).Owned_by.isEmpty()){
                    System.out.println("+------------------------------------+");
                    System.out.println("|    L'étudiant n'a jamais réservé   |");
                    System.out.println("+------------------------------------+");
                } else {
                    int ireserve = i;
                    System.out.println("-> Livres reservés :");
                    for (int j = 0; j<ArrayStudent.get(ireserve).Owned_by.size(); j++) {
                        System.out.println("\t- Livre " + (j+1) +" :" + ArrayStudent.get(ireserve).Owned_by.get(j).Title);
                    }
                    if (ArrayReservation.get(i).WarningReservation){
                        System.out.println("Alert : le livre "+ArrayReservation.get(i).Book_Reservation.Title+" resérvé par "+ArrayReservation.get(i).Student_Reservation.Name+" doit retourner en "+ArrayReservation.get(i).Date_End);
                    }
                }
            }
        }
    }
    void AddReservation() {
        Reservation POOReservation = new Reservation();
        LocalDate currenteDate = LocalDate.now();
        LocalDate FormatDate;
        boolean BookFound = false;
        boolean StudentFound = false;
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
            for (Student ReserveStudent : ArrayStudent){
                if (ReserveStudent.Name.equals(CheckStudentName)){
                    StudentFound = true;
                    System.out.println("Entrez Le titre du livre à reserver : ");
                    String CheckBookName = scanner.nextLine();
                    for (Book ReserveBook : ArrayBook){
                        if(ReserveBook.Title.equals(CheckBookName)){
                            BookFound = true;
                        if(!ReserveBook.Booked) {
                            ReserveStudent.Owned_by.add(ReserveBook);
                            POOReservation.Book_Reservation = ReserveBook;
                            ReserveBook.Owner = ReserveStudent;
                            POOReservation.Student_Reservation = ReserveStudent;
                            POOReservation.Date_Begin = currenteDate ;
                            String FormatterDate;
                            System.out.println("Entrez la date fin de réservation (AAAA-MM-JJ) : ");
                            do {
                                FormatterDate = scanner.nextLine();
                                try {
                                    FormatDate = LocalDate.parse(FormatterDate, DateTimeFormatter.ISO_DATE);
                                    break;
                                }catch (DateTimeParseException e){
                                    System.out.println("Entrez la date fin de réservation (AAAA-MM-JJ) : ");
                                }
                            }while (true);
                            POOReservation.Date_End = FormatDate;
                            ArrayReservation.add(POOReservation);
                            System.out.println("+------------------------------------+");
                            System.out.println("|La réservation effuectée avec succes|");
                            System.out.println("+------------------------------------+");
                            ReserveBook.Booked = true;
                        } else {
                            System.out.println("+------------------------------------+");
                            System.out.println("|      Le livre est deja reservé     |");
                            System.out.println("+------------------------------------+");
                        }
                        break;
                        }
                    }
                    if (!BookFound){
                        System.out.println("+------------------------------------+");
                        System.out.println("|       Le livre n'existe pas!       |");
                        System.out.println("+------------------------------------+");
                    }
                    break;
                    }
            }
            if(!StudentFound){
                    System.out.println("+------------------------------------+");
                    System.out.println("|      L'étudiant n'existe pas!      |");
                    System.out.println("+------------------------------------+");
            }

        }

    }
    void DisplayReservations() {
        if (ArrayReservation.isEmpty()) {
            System.out.println("+-------------------------------------+");
            System.out.println("| Aucune réservation pour l'instant ! |");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|      La liste des réservations     |");
            System.out.println("+------------------------------------+");
            for (int i = 0; i < ArrayReservation.size(); i++) {
                System.out.println("+-------| Réservation ID : " + (i + 1) + " |-------+");
                System.out.println("-> Nom d'apprenant : " + ArrayReservation.get(i).Student_Reservation.Name);
                System.out.println("-> Numéro d'identification : " + ArrayReservation.get(i).Student_Reservation.Identification_Number);
                System.out.println("-> Livre N° : " + (i + 1));
                System.out.println("\t- Titre de livre réservé : " + ArrayReservation.get(i).Book_Reservation.Title);
                System.out.println("\t- Date début de réservation : " + ArrayReservation.get(i).Date_Begin);
                System.out.println("\t- Date fin de réservation : " + ArrayReservation.get(i).Date_End);
                WarningReservation();
                if (ArrayReservation.get(i).WarningReservation){
                    System.out.println("Alert : le livre "+ArrayReservation.get(i).Book_Reservation.Title+" resérvé par "+ArrayReservation.get(i).Student_Reservation.Name+" doit retourner en "+ArrayReservation.get(i).Date_End);
                }
                System.out.println("+------------------------------------+");
                }
            }
        }
    void ReturnReservation() {
        if (ArrayReservation.isEmpty()) {
            System.out.println("+-------------------------------------+");
            System.out.println("| Aucune réservation pour l'instant ! |");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|       Annuler une réservations     |");
            System.out.println("+------------------------------------+");
            System.out.println("Entrez le nom de l'étudiant :");
            String returnStudent = scanner.nextLine();
            boolean foundReservation = false;
            for (int i = 0; i <ArrayReservation.size(); i++) {
                if (ArrayReservation.get(i).Student_Reservation.Name.equals(returnStudent)) {
                    foundReservation = true;
                    System.out.println("+------------------------------------+");
                    System.out.println("| Livres réservés par " + returnStudent + " :");
                    System.out.println("+------------------------------------+");
                    for (Reservation  ReturnReservation : ArrayReservation) {
                        int r;
                        System.out.println("- Livre : " + ReturnReservation.Book_Reservation.Title);
                    }
                    System.out.println("Entrez le titre du livre à annuler :");
                    String returnBookTitle = scanner.nextLine();
                    for (Book ReturnBook : ArrayBook) {
                        if (ReturnBook.Title.equals(returnBookTitle)) {
                            ReturnBook.Booked = false;
                            ReturnBook.Owner = null;
                            for (Student ReturnStudent : ArrayStudent){
                                if(ReturnStudent.Name.equals(returnStudent)){
                                    ReturnStudent.Owned_by.remove(ReturnBook);
                                }
                            }
                            ArrayReservation.remove(i);
                            ArrayReservation.get(i).WarningReservation = false;
                            System.out.println("+------------------------------------+");
                            System.out.println("| L'annulation effuectée avec succes |");
                            System.out.println("+------------------------------------+");
                            break;
                        }
                    }
                }
            }
            if (!foundReservation) {
                System.out.println("+-------------------------------------+");
                System.out.println("|    Aucune réservation trouvée !     |");
                System.out.println("+-------------------------------------+");
            }
        }
    }
    void WarningReservation (){
        for(int i =  0; i < ArrayReservation.size(); i++){
            if (ArrayReservation.get(i).Date_End.compareTo(ArrayReservation.get(i).Date_Begin) < 0) {
                ArrayReservation.get(i).WarningReservation = true;
            }
        }
    }
    void DisplayWarningReservation(){
        WarningReservation();
        boolean WarningFound = false;
        if (ArrayReservation.isEmpty()) {
            System.out.println("+-------------------------------------+");
            System.out.println("| Aucune réservation pour l'instant ! |");
            System.out.println("+-------------------------------------+");
        } else {
            System.out.println("+------------------------------------+");
            System.out.println("|        Alerte de réservation       |");
            System.out.println("+------------------------------------+");
            for (int i = 0; i < ArrayReservation.size(); i++) {
                if (ArrayReservation.get(i).WarningReservation) {
                    System.out.println("+-------| Réservation ID : " + (i + 1) + " |-------+");
                    System.out.println("-> Nom d'apprenant : " + ArrayReservation.get(i).Student_Reservation.Name);
                    System.out.println("-> Numéro d'identification : " + ArrayReservation.get(i).Student_Reservation.Identification_Number);
                    System.out.println("-> Livre N° : " + (i + 1));
                    System.out.println("\t- Titre de livre réservé : " + ArrayReservation.get(i).Book_Reservation.Title);
                    System.out.println("\t- Date début de réservation : " + ArrayReservation.get(i).Date_Begin);
                    System.out.println("\t- Date fin de réservation : " + ArrayReservation.get(i).Date_End);
                    System.out.println("Alert : le livre " + ArrayReservation.get(i).Book_Reservation.Title + " resérvé par " + ArrayReservation.get(i).Student_Reservation.Name + " doit retourner en " + ArrayReservation.get(i).Date_End);
                    System.out.println("+------------------------------------+");
                }
            }
        }
    }
}



