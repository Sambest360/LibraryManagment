public class Collections {
    private String bookName;
    private String author;
    private String collectionType; //Types (Books, Periodicals, Multimedia, Special Collections, E-Resources)
    private String inventoryManagement; //Track the status of items (available, checked out, lost, damaged)

    public Collections(String bookName, String author, String collectionType, String inventoryManagement) {
        this.bookName = bookName;
        this.author = author;
        this.collectionType = collectionType;
        this.inventoryManagement = inventoryManagement;
    }

    public String getBookName (){
        return bookName;
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

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
        return "Name: " + getBookName() +
                "\nAuthor: " + getAuthor() +
                "\nCollection Type: " + getCollectionType() +
                "\nInventory Management: " + getInventoryManagement();
    }
}
