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
        System.out.println("Enter inventory management status: ");
        String invManagement = sc.nextLine();

        Circulation_Desk newDesk = new Circulation_Desk(bookName, author, collType, invManagement, true);

        System.out.println(newDesk);

    }
}