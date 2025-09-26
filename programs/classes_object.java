package programs;
class Bag{
	int pen=5;
	int laptop=1;
	void store() {
		System.out.println("Books,pen,laptop");
	}
	void Books() {
		System.out.println("Java Books");
	}
	void thing() {
		System.out.println("Syrup");
	}
}
public class classes_object {

	public static void main(String[] args) {
		Bag bag=new Bag();
		int pen1=bag.pen;
		int lap=bag.laptop;
		System.out.println(pen1);
		System.out.println(lap);
		
		Bag sagar = new Bag();
		sagar.Books();
		Bag Skandha=new Bag();
		Skandha.thing();
	}

}
