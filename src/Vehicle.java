import java.util.HashMap;
import java.util.Map;

class Vehicle {
    private Map<String, Car> cars;
    private Map<String, Customer> users; // Map to store users

    public Vehicle() {
        cars = new HashMap<>();
        users = new HashMap<>();
        loadItems();
    }

    private void loadItems() {
        cars.put("1", new RangeRover("RED", "FGU7CXDSUG"));
        cars.put("2", new RangeRover("YELLOW", "FGU7CXDSUG"));
        cars.put("3", new Ferrarri("BLACK", "FGU7CXDSUG"));
        cars.put("4", new Ferrarri("ORANGE", "FGU7CXDSUG"));
    }

    public void createAccount(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Account already exists.");
        } else {
            users.put(username, new Customer(username, password));
            System.out.println("Account created successfully.");
        }
    }

    public boolean login(String username, String password) {
        Customer user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public void displayAvailableItems(String itemType) {
        System.out.println("Available Cars:");
        Car item = null;
        for (String key : cars.keySet()) {
            item = cars.get(key);
            if (!item.isRented() && item.getColour().equalsIgnoreCase(itemType)) {
                System.out.println(item + "(Id: " + key + ")");
            }
        }
    }

    public void rentItem(String id) {
        Car car = cars.get(id);
        if (car != null) {
            if (!car.isRented()) {
                car.rent();
                System.out.println("You have rented: " + car.getLicencePlate());
            } else {
                System.out.println("Sorry, this item is already rented.");
            }
        } else {
            System.out.println("Item not found.");
        }
    }

    public void returnItem(String id) {
        Car car = cars.get(id);
        if (car != null) {
            if (car.isRented()) {
                car.returnItem();
                System.out.println("You have returned: " + car.getLicencePlate());
            } else {
                System.out.println("This item was not rented.");
            }
        } else {
            System.out.println("Item not found.");
        }
    }
}

