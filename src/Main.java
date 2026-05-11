public class Main {

    public static void main(String[] args) {

        // Création de l'objet ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Contact 1
        Contact contact1 = new Contact();
        contact1.name = "Fatao";
        contact1.phoneNumber = "0707070707";
        myContactsManager.addContact(contact1);

        // Contact 2
        Contact contact2 = new Contact();
        contact2.name = "Eveline";
        contact2.phoneNumber = "0101010101";
        myContactsManager.addContact(contact2);

        // Contact 3
        Contact contact3 = new Contact();
        contact3.name = "Gede";
        contact3.phoneNumber = "0505050505";
        myContactsManager.addContact(contact3);

        // Contact 4
        Contact contact4 = new Contact();
        contact4.name = "Seydou";
        contact4.phoneNumber = "0777777777";
        myContactsManager.addContact(contact4);

        // Contact 5
        Contact contact5 = new Contact();
        contact5.name = "Tresor";
        contact5.phoneNumber = "0555555555";
        myContactsManager.addContact(contact5);

        // Recherche d'un contact
        Contact result = myContactsManager.searchContact("Eveline");

        // Affichage du numéro
        if (result != null) {
            System.out.println("Numéro de Eveline : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé");
        }
    }
}