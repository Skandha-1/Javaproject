package programs;
class Car {
    String model;
    int year;
 
    // Default constructor
    Car() {
        model = "Unknown";
        year = 0;
    }
 
    // Parameterized constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
 
    public void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}
 
public class Main5 {
    public static void main(String[] args) {
        Car car1 = new Car();                // default constructor
        Car car2 = new Car("Tesla", 2023);   // parameterized constructor
 
        car1.display();
        car2.display();
    }
}

