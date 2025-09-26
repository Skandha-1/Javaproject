package anonymousclass;
enum Day{
	MONDAY,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
public class Example4EnumClass {

	public static void main(String[] args) {
		Day today = Day.Wednesday;
		System.out.println("Today is:"+today);
		
		//Using enum in Switch
		switch (today) {
		case MONDAY:
			System.out.println("Start of the work week!");
		case Friday:
			System.out.println("Weekend is near!");
			break;
		default:
			System.out.println("It is a regular day. ");
		
		}
	}

}
