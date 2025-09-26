package programs;

import java.util.Scanner;
public class EmployeeOnboardingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Store Employee Information
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        double experience = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Highest Degree (Bachelors/Masters/PhD): ");
        String degree = sc.nextLine();

        System.out.print("Do you have Security Clearance? (true/false): ");
        boolean hasClearance = sc.nextBoolean();
        //2.Salary 
        double salary=50000;
        if (experience>5) {
        	salary+=15000;
        	
        	}else if(experience>=3) {
        		salary+=1000;
        		
       
        }

          // 3. Calculate Signing Bonus
             double bonus = salary * 0.05;
             if (hasClearance) {
                 bonus+=2000;

          //4. Assign Department
	        String department;
	        switch (degree) {
	            case "PhD":
	                department = "R&D";
	                break;
	            case "Masters":
	                department = "Data Analytics";
	                break;
			     default:
	                 department = "General Admin";
	                     }

                     // 6. Display Onboarding Summary
                     System.out.println("\n--- Onboarding Summary ---");

			        System.out.println("Employee ID: " + empId);
			        System.out.println("Name: " + fullName);
			        System.out.println("Department: " + department);
			        System.out.println("Experience: " + experience + " years");
			        System.out.println("Negotiated Salary: ₹" + salary);
			        System.out.println("Signing Bonus: ₹" + bonus);
//			        System.out.println("Temporary Password: " + password);

			     // 7. Special Note
			             if (department.equals("R&D") && hasClearance) {
			                 System.out.println("Note: Grant lab access and schedule safety briefing.");
			             }

			             sc.close();

	}

}

	}
