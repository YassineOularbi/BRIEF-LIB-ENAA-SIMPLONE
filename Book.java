import java.util.Scanner;

class Book {
        String Title;
        String Author;
        String Publication_Date;
        String ISBN_Number;
        String Owner;
        void ModifyBook () {
                Scanner scanner = new Scanner(System.in);
                                 System.out.println("+------------------------------------+");
                                 System.out.println("Entrez le titre du livre : ");
                                 this.Title = scanner.nextLine();
                                 System.out.println("Entrez L'auteur du livre : ");
                                 this.Author = scanner.nextLine();
                                 System.out.println("Entrez la date de publication du livre : ");
                                 this.Publication_Date = scanner.nextLine();
                                 System.out.println("Entrez le numéro ISBN du livre : ");
                                 this.ISBN_Number = scanner.nextLine();
                                }

                        }

