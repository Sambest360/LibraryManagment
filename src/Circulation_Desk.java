import java.util.Objects;

public class Circulation_Desk extends Collections {

    private boolean available;

    public Circulation_Desk(String bookName, String author, String collectionType, String inventoryManagement, boolean available) {
        super(bookName, author, collectionType, inventoryManagement);
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String loan_Management() {
        if (!available) {
            return "This book is Currently Unavailable.";
        } else {
            return "Available.";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nAvailability: " + loan_Management();
    }
}
