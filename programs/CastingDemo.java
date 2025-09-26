package programs;

public class CastingDemo {

	public static void main(String[] args) {
          //1.Implicit Casting (Widening)
		int experienceYears=5;
		double salary = 5000+(experienceYears*1200);
		double updatedSalary = salary;
		System.out.println("Implict Casting Employee Salary=$"+ updatedSalary);
		
		//2.Explicit Casting(Narrowing)
		double bouns =3456.98;
		int roundedBouns = (int) bouns;
		System.out.println("explicit Casting Employee Salary=$"+ roundedBouns);
       //3. Another scenario
		float productRating=4.6f;
		int rating=(int) productRating;
		System.out.println("Explicit Casting LProduct rating as integer="+rating);
		
	}

}
