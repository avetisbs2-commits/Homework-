package system_design;

public class LibraryTest {

    LibraryTest(){

    }

    public static void main(String[] args) {

        Book book1 = new Book("Don Quixote", "Miguel de Cervantes", 15.99);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 12.50);
        Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", 18);
        Book book4 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 14);
        Book book5 = new Book("Fahrenheit 451", "Ray Bradbury", 13.99);

        Library cityLibrary = new Library("City Library");
        Library schoolLibrary = new Library("School Library");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);
        cityLibrary.addBook(book3);

        schoolLibrary.addBook(book4);
        schoolLibrary.addBook(book5);
        schoolLibrary.addBook(book1);

        cityLibrary.showBooks();
        schoolLibrary.showBooks();
    }
}