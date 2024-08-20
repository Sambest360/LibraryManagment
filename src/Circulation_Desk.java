import java.util.Objects;

public class Circulation_Desk extends Collections{

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

    public void loan_Management(boolean available) {
        do {
            if (Objects.equals(available, false)) {
                System.out.println("This book is Currently Unavailable.");
            } else {
                System.out.println("Available.");
                break;
            }
        } while(true);
    }
}
