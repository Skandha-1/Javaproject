package programs;
class person{
	void details(){
	  System.out.println("The details of Preson");
	}
}
	interface Worker{
		void work();
	}
	interface Learner{
		void learn();
	}
	class StudentEmployee extends person implements Worker,Learner{
		public void work() {
			System.out.println("StudentEmployee Working");
		}
		public void learn() {
			System.out.println("StudentEmployee Learnring");
		}
	}

public class HybridInheritance {

	public static void main(String[] args) {
		StudentEmployee se=new StudentEmployee();
		se.details();
		se.work();
		se.learn();

	}

}
