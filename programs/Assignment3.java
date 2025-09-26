package programs;
 
class Assignment3 {
    // Instance variable
    double radius;
 
    // Default constructor
    public Assignment3() {
        this.radius = 1.0; // default radius
    }
 
    // Overloaded constructor
    public Assignment3(double radius) {
        this.radius = radius;
    }
 
    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
    
  class AssignmentDay3_3{
    public static void main(String[] args) {
        // Using default constructor
        Assignment3 circle1 = new Assignment3();
        System.out.println("Area of circle1 (default radius): " + circle1.calculateArea());
 
        // Using overloaded constructor
        Assignment3 circle2 = new Assignment3(5.5);
        System.out.println("Area of circle2 (radius 5.5): " + circle2.calculateArea());
    }
}