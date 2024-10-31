import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class VehicalRentalSystem {
    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        String choice;

        // Predefined user for login
        users.put("admin", "password");

        // User login or registration
        System.out.println("---------- WELCOME TO ----------");
        System.out.println("--- Car Rental System ---\n");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("Enter your choice: ");
        String loginChoice = scanner.nextLine();

        if (loginChoice.equals("2")) {
            System.out.print("Enter new username: ");
            String newUsername = scanner.nextLine();
            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine();
            registerUser(newUsername, newPassword);
        }

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (!authenticateUser(username, password)) {
            System.out.println("Invalid credentials. Exiting the system.");
            scanner.close();
            return;
        }

        do {
            System.out.println("1. View Available Vehicle");
            System.out.println("2. View Available Cars");
            System.out.println("3. Rent an Vehicle");
            System.out.println("4. Return an Vehicle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    vehicle.displayAvailableItems("Ferrarri");
                    break;
                case "2":
                    vehicle.displayAvailableItems("RangeRover");
                    break;
                case "3":
                    System.out.print("Enter Car ID to rent: ");
                    String rentId = scanner.nextLine();
                    vehicle.rentItem(rentId);
                    break;
                case "4":
                    System.out.print("Enter Car ID to return: ");
                    String returnId = scanner.nextLine();
                    vehicle.returnItem(returnId);
                    break;
                case "5":
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (!choice.equals("5"));

        scanner.close();
    }

    private static boolean authenticateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    private static void registerUser(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please try a different one.");
        } else {
            users.put(username, password);
            System.out.println("User registered successfully. Please login.");
        }
    }
}