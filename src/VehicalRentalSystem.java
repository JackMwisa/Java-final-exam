import java.util.Scanner;

public class VehicalRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        String choice;

        // User login
        System.out.println("---------- WELCOME TO ----------");
        System.out.println("--- Car Rental System ---\n");
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

    // logi

    private static boolean authenticateUser(String username, String password) {
        // Placeholder for actual authentication logic
        return "admin".equals(username) && "password".equals(password);
    }
}