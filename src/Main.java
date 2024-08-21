import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!!!");
        System.out.println("Browse our library");

        System.out.println("Enter your Full Name: ");
        String fullName = sc.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNum = sc.nextLine();

        System.out.println("Enter your Email address: ");
        String email = sc.nextLine();

        while (true) {

            System.out.println("Enter your book name: ");
            String bookName = sc.nextLine();

            LibraryCollection user1 = new LibraryCollection(bookName, fullName, phoneNum, email);
            System.out.println(user1);

            System.out.println("Do you want to check out or check in this book? (Enter 'check out', 'check in', or 'no'): ");
            String action = sc.nextLine();

            switch (action.toLowerCase()) {
                case "check out":
                    user1.checkOutBook();
                    System.out.println("Book checked out successfully.");
                    break;
                case "check in":
                    user1.checkInBook();
                    System.out.println("Book checked in successfully.");
                    break;
                case "no":
                    System.out.println("No action taken.");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

            System.out.println(user1);

            System.out.println("Do you want to continue? (yes/no): ");
            String continueOption = sc.nextLine();
            if (continueOption.equalsIgnoreCase("no")) {
                System.out.println("Come back soon!!!");
                break;
            }
        }

        sc.close();
    }
}