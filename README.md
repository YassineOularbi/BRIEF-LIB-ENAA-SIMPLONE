# Application de gestion de bibliothèque ENAA

## Description
Ce projet consiste en une application console en Java pour la gestion de bibliothèque dans l'école ENAA de Béni Mellal. L'application permet l'ajout, la modification, la suppression et la consultation des informations des livres et des apprenants.

## Fonctionnalités

### Bibliothèque (class Library)
- Gère la bibliothèque dans son ensemble.
- Contient une liste de Livres, une liste d'Apprenants et liste des reservation.
- Permet d'ajouter, supprimer, afficher et rechercher des livres et des étudiantes.
- Permet de reserver ou returner un livre.

### Livre (class Book)
- Représente un livre avec des attributs tels que le titre, l'auteur, le numéro ISBN, la date de publication, etc.
- Possède des méthodes pour modifier les détails du livre.
- Contient un attribut pour stocker l'emprunteur actuel du livre, généralement de type Apprenant (Student).

### Apprenant (class Student)
- Représente un apprenant avec des informations personnelles telles que le nom, l'adresse, le numéro d'identification, etc.
- Possède un attribut pour stocker la liste des livres empruntés par cet apprenant.

### Menu (class Menu)
- Gère l'interface utilisateur en console.
- Affiche les options disponibles, recueille l'entrée de l'utilisateur et déclenche les actions appropriées en fonction de ce que l'utilisateur choisit.

### Réservation (class Reservation)
- Contient des attribues de type Apprenant (Student) et livre (Book) et les dates de reservations;
- Contient des methodes de réclamation de rappels automatique.

## Rappels
- Rappels automatiques pour les retours en retard.

## Instructions d'exécution
1. Clonez ce dépôt avec la commande `git clone https://github.com/YassineOularbi/BRIEF-LIB-ENAA-SIMPLONE.git`.
2. Accédez au répertoire du projet avec la commande `cd BRIEF-LIB-ENAA-SIMPLONE`.
3. Compilez le code source avec la commande `javac Main.java`.
4. Exécutez le programme avec la commande `java Main`.
5. Suivez les instructions affichées dans la console pour utiliser l'application.

## Auteurs
Ce projet a été développé par [Yassine OULARBI], sous la supervision de l'école ENAA Béni Mellal.

## Contact
Pour toute question ou commentaire, veuillez contacter [yassineoularbi4@gmail.com] ou [+212 6 10 44 60 80].
LinkedIn : "www.linkedin.com/in/yassine-oularbi-79730424b"
