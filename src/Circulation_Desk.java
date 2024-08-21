import java.util.Collections;
import java.util.Objects;

public class Circulation_Desk {

    private boolean available;

    public Circulation_Desk(boolean available) {
        super();
        this.available = available;
        //, String author, String collectionType, String inventoryManagement, String fullName, String bookName, String phoneNum, String email
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private void books() {

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
