package Assignement;
class Employee{
	protected String name;
	public Employee (String name) {
		this.name=name;
	}
	double Calculatedsalary() {
		return 0.0;
	}}
class Manager extends Employee{
   private	int salary;
   private int bonus;
   Manager(int salary,int bonus,String name){
	   super(name);
	this.salary=salary;
	this.bonus=bonus;
	
   }
	double Calculatedsalary() {
        return bonus+salary;
}}
class developer extends Employee{
	private int Salary;
	private int overtime;
	private int overtimerate;
	developer(int Salary,int overtime,int overtimerate,String name){
		super(name);
	this.overtime=overtime;
	this.overtimerate=overtimerate;
	this.Salary=Salary;
	}
	 double Calculatedsalary() {
        return (Salary)+(overtime*overtimerate);
}}            
public class Assignment4 {

	public static void main(String[] args) {
		Manager m=new Manager(5000000,10000,"Skandha");
		developer d =new developer(400000,5,100,"Sagar");
		
		System.out.println(d.Calculatedsalary());
		System.out.println(m.Calculatedsalary());

	}

}
