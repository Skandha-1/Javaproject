package Assignement;
import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}  
public class ProductCat {

	  public static void main(String[] args) {
	        List<Product> products = new ArrayList<>();
	        products.add(new Product(101, "Laptop", 75000));
	        products.add(new Product(102, "Phone", 25000));
	        products.add(new Product(103, "Tablet", 30000));

	        for (Product product1 : products) {
	            product1.display();
	        }
	    }
	}
