package programs;
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(6,"java");
		System.out.println(sb);
		sb.replace(0,5,"HI");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println("StringBuilder output : "  + sb);
	System.out.println();
	System.out.println("String Buffer ");

	StringBuffer sb1 = new StringBuffer("Hello");
	sb1.append("world");
	System.out.println(sb1);
	sb1.insert(6,"java");
	System.out.println(sb1);
	sb1.replace(0,5,"HI");
	System.out.println(sb1);
	sb1.reverse();
	System.out.println(sb1);
	System.out.println("StringBuilder output : "  + sb1);
		}

}

