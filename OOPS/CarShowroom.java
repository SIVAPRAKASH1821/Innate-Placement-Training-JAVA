import java.util.ArrayList;
import java.util.Scanner;

// Abstract Class (Abstraction)
abstract class Car {
    private String model;
    private double price;

    // Constructor
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Encapsulation (getters & setters)
    public String getModel() { return model; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    // Polymorphism (abstract method)
    public abstract void showCarDetails();
}

// Inheritance
class Sedan extends Car {
    private int seatingCapacity;

    public Sedan(String model, double price, int seatingCapacity) {
        super(model, price);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void showCarDetails() {
        System.out.println("🚗 Sedan: " + getModel() + " | Price: ₹" + getPrice() + " | Seats: " + seatingCapacity);
    }
}

class SUV extends Car {
    private boolean fourWheelDrive;

    public SUV(String model, double price, boolean fourWheelDrive) {
        super(model, price);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public void showCarDetails() {
        System.out.println("🚙 SUV: " + getModel() + " | Price: ₹" + getPrice() + " | 4x4: " + (fourWheelDrive ? "Yes" : "No"));
    }
}

class SportsCar extends Car {
    private int topSpeed;

    public SportsCar(String model, double price, int topSpeed) {
        super(model, price);
        this.topSpeed = topSpeed;
    }

    @Override
    public void showCarDetails() {
        System.out.println("🏎 Sports Car: " + getModel() + " | Price: ₹" + getPrice() + " | Top Speed: " + topSpeed + " km/h");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> showroom = new ArrayList<>();

        System.out.println("🚘 Welcome to Car Showroom System 🚘");

        while (true) {
            System.out.println("\n1. Add Sedan");
            System.out.println("2. Add SUV");
            System.out.println("3. Add Sports Car");
            System.out.println("4. Show All Cars");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Model: ");
                    String sModel = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double sPrice = sc.nextDouble();
                    System.out.print("Enter Seating Capacity: ");
                    int seats = sc.nextInt();
                    showroom.add(new Sedan(sModel, sPrice, seats));
                    break;

                case 2:
                    System.out.print("Enter Model: ");
                    String suvModel = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double suvPrice = sc.nextDouble();
                    System.out.print("Has 4x4 drive (true/false): ");
                    boolean is4x4 = sc.nextBoolean();
                    showroom.add(new SUV(suvModel, suvPrice, is4x4));
                    break;

                case 3:
                    System.out.print("Enter Model: ");
                    String spModel = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double spPrice = sc.nextDouble();
                    System.out.print("Enter Top Speed (km/h): ");
                    int speed = sc.nextInt();
                    showroom.add(new SportsCar(spModel, spPrice, speed));
                    break;

                case 4:
                    System.out.println("\n🚘 Cars Available in Showroom:");
                    for (Car c : showroom) {
                        c.showCarDetails(); // Polymorphism
                    }
                    break;

                case 5:
                    System.out.println("👋 Thank you for visiting Car Showroom!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
