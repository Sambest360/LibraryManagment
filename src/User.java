public class User {
    private String fullName;
    private String bookName;
    private String phoneNum;
    private String email;

    public User(String fullName, String bookName, String phoneNum, String email) {
        this.fullName = fullName;
        this.bookName = bookName;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }
    public String getBookName() {
        return bookName;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getEmail() {
        return email;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
