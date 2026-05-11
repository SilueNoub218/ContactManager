public class ContactsManager {

    Contact[] myFriends;
    int friendsCount;

    // Constructeur
    public ContactsManager() {
        myFriends = new Contact[500];
        friendsCount = 0;
    }

    // Méthode pour ajouter un contact
    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Méthode pour rechercher un contact
    public Contact searchContact(String searchName) {

        for (int i = 0; i < friendsCount; i++) {

            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }

        return null;
    }
}