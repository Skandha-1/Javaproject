package exceptionHandling;
import java.io.*;

//custom Exception (User -defined)
class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
		System.out.println(message);
	}
}
public class ExamoleOfExcep {
    public static void riskyOperation(String input)throws   IOException ,CustomException{
    	try {
    		if (input==null) {
    			throw new CustomException("Input cannot be null.");
    		}
    		FileWriter writer = new FileWriter("Example.txt");
    		writer.write("user input"+input);
    		writer.close();
    		System.out.println("Data written sucessfully");
    		
    		FileReader reader = new FileReader("Example.txt");
    		BufferedReader br=new BufferedReader(reader);
    		System.out.println(br.readLine());
    		System.out.println("Read");
    	}catch (IOException e) {
    		System.out.println("Exception occured :"+ e.getMessage());
    				e.printStackTrace();
    	}
    }
	public static void main(String[] args) {
		try {
			//Example 1:ArithmeticException
			int result=10/2;
			System.out.println(result);
			
			//Example 2:ArrayIndexOutOfBoundException
			int[] arr= {1,2,3};
			System.out.println(arr[0]);
			
			//Example 3: NumberFormatException
			int num=Integer.parseInt("10");
			System.out.println(num);
			
			//Eample 4:CustomException + IOException
			riskyOperation(null);
		}
		catch(ArithmeticException e) {
			System.out.println("Caught ArtthmeticException :"+ e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundException"+e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("caught NumberFormatException"+e.getMessage());
			
		} catch(IOException e) {
	    	 System.out.println("Caught IOException"+e.getMessage());
	    	
	     }
		catch (CustomException e) {
            System.out.println("Caught CustomException : " + e.getMessage());
        }
			
		catch (Exception e) {
			System.out.println("Caught geneeral exception"+e.getMessage());
		}
        finally {
        	System.out.println("Finally block executed::Cleeaning up resources");
        }System.out.println("After all Excepions");
		}
	}


