import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        String bookName = sc.nextLine();
        System.out.println("Enter Author: ");
        String author = sc.nextLine();
        System.out.println("Enter collection type: ");
        String collType = sc.nextLine();
        System.out.println("Enter inventory management status");
        String invManagement = sc.nextLine();

        Collections book = new Collections(bookName, author, collType, invManagement);

        System.out.println(book);
    }
}