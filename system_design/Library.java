package system_design;

public class Library {
    protected String libraryName;

    private Book[] books;

    public Library(String libraryName){
        setLibraryName(libraryName);
        this.books = new Book[100];
    }

    void setLibraryName(String libraryName){
        this.libraryName = libraryName;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("  - " + books[i]);
            }
        }
    }
}
