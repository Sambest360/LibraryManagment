import java.util.Objects;

public class LibraryCollection extends User {
    private String author;
    private String collectionType; // Types (Books, Periodicals, Multimedia, Special Collections, E-Resources)
    private String inventoryManagement; // Track the status of items (available, checked out, lost, damaged)

    public LibraryCollection(String bookName, String fullName, String phoneNum, String email) {
        super(fullName, bookName, phoneNum, email);
        this.author = "Unknown"; // Default value
        this.collectionType = "Unknown"; // Default value
        this.inventoryManagement = "Unknown"; // Default value
        updateBookDetails(bookName); // Method to set author, collectionType, and inventoryManagement
    }

    private void updateBookDetails(String bookName) {
        // Book details are set based on the book name
        if (Objects.equals(bookName, "To Kill a Mockingbird")) {
            author = "Harper Lee";
            collectionType = "Book";
            inventoryManagement = "Checked out";
        } else if (Objects.equals(bookName, "1984")) {
            author = "George Orwell";
            collectionType = "Book";
            inventoryManagement = "Available";
        } else if (Objects.equals(bookName, "The Great Gatsby")) {
            author = "F. Scott Fitzgerald";
            collectionType = "Book";
            inventoryManagement = "Checked out";
        } else if (Objects.equals(bookName, "The Catcher in the Rye")) {
            author = "J.D. Salinger";
            collectionType = "Book";
            inventoryManagement = "Available";
        } else if (Objects.equals(bookName, "Moby Dick")) {
            author = "Herman Melville";
            collectionType = "Book";
            inventoryManagement = "Lost";
        } else if (Objects.equals(bookName, "Pride and Prejudice")) {
            author = "Jane Austen";
            collectionType = "Book";
            inventoryManagement = "Damaged";
        } else if (Objects.equals(bookName, "The Hobbit")) {
            author = "J.R.R. Tolkien";
            collectionType = "Book";
            inventoryManagement = "Available";
        } else if (Objects.equals(bookName, "Brave New World")) {
            author = "Aldous Huxley";
            collectionType = "Book";
            inventoryManagement = "Checked out";
        } else if (Objects.equals(bookName, "The Odyssey")) {
            author = "Homer";
            collectionType = "Book";
            inventoryManagement = "Available";
        } else if (Objects.equals(bookName, "War and Peace")) {
            author = "Leo Tolstoy";
            collectionType = "Book";
            inventoryManagement = "Checked out";
        } else if (Objects.equals(bookName, "The Da Vinci Code")) {
            author = "Dan Brown";
            collectionType = "Book";
            inventoryManagement = "Available";
        } else {
            author = "Unknown";
            collectionType = "Unknown";
            inventoryManagement = "Unknown";
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public String getInventoryManagement() {
        return inventoryManagement;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    public void setInventoryManagement(String inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    public void checkOutBook() {
        if (inventoryManagement.equals("Available")) {
            inventoryManagement = "Checked out";
        } else {
            System.out.println("Book is not available for checkout.");
        }
    }

    public void checkInBook() {
        if (inventoryManagement.equals("Checked out")) {
            inventoryManagement = "Available";
        } else {
            System.out.println("Book is not checked out.");
        }
    }

    @Override
    public String toString() {
        return "Full Name: " + getFullName() +
                "\nPhone Number: " + getPhoneNum() +
                "\nEmail address: " + getEmail() +
                "\nBook Name: " + getBookName() +
                "\nAuthor: " + author +
                "\nCollection Type: " + collectionType +
                "\nInventory Management: " + inventoryManagement;
    }
}
