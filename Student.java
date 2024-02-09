import java.util.Scanner;

class Student {
        String Name;
        String Address;
        String Identification_Number;
        String Classroom;
        void ModifyStudent () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("+------------------------------------+");
                System.out.println("Entrez le nom d'étudiant(e) : ");
                this.Name = scanner.nextLine();
                System.out.println("Entrez l'adresse d'étudiant(e) : ");
                this.Address = scanner.nextLine();
                System.out.println("Entrez la numéro d'identification : ");
                this.Identification_Number = scanner.nextLine();
                System.out.println("Entrez la classe d'étudiant(e) : ");
                this.Classroom = scanner.nextLine();
        }
}
