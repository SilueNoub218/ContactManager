Projet ContactsManager
Description
Le projet ContactsManager est une application Java simple permettant de gérer une liste de contacts.
L’utilisateur peut :
ajouter des contacts ;
enregistrer un nom et un numéro de téléphone ;
rechercher un contact par son nom ;

afficher le numéro du contact recherché.

Structure du projet
Le projet contient trois classes principales :
1. Contact
Cette classe représente un contact.
Attributs :
name : nom du contact ;
phoneNumber : numéro de téléphone du contact.

2. ContactsManager
Cette classe permet de gérer les contacts.
Méthodes :
addContact(Contact contact)
Ajoute un contact dans la liste.
searchContact(String searchName)
Recherche un contact à partir de son nom.

3. Main
Cette classe contient la méthode principale main().
Elle permet :
de créer un gestionnaire de contacts ;
d’ajouter plusieurs contacts ;
de rechercher un contact ;
d’afficher son numéro de téléphone.
Technologies utilisées
Java.


