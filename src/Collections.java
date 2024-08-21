public class Collections extends User {
    private String bookNameColl;
    private String author;
    private String collectionType; //Types (Books, Periodicals, Multimedia, Special Collections, E-Resources)
    private String inventoryManagement; //Track the status of items (available, checked out, lost, damaged)

    public Collections(String bookNameColl, String author, String collectionType, String inventoryManagement, String fullName, String bookName, String phoneNum, String email) {
        super(fullName, bookName, phoneNum, email);
        this.bookNameColl = bookNameColl;
        this.author = author;
        this.collectionType = collectionType;
        this.inventoryManagement = inventoryManagement;
    }

    public Collections(String bookNameColl, String author, String collectionType, String inventoryManagement, String fullName, String bookName, String phoneNum, String email) {
        super( fullName, bookName, phoneNum, email);
    }

    public String getBookNameColl (){
        return bookNameColl;
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

    public void setBookName(String bookNameColl) {
        this.bookNameColl = bookNameColl;
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

    @Override
    public String toString() {
        return "Name: " + getBookNameColl() +
                "\nAuthor: " + getAuthor() +
                "\nCollection Type: " + getCollectionType() +
                "\nInventory Management: " + getInventoryManagement();
    }
}
