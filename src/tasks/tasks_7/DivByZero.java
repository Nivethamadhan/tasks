package tasks.tasks_7;

public class DivByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 5;
	        int b = 0;
	        try {
	            System.out.println(a / b); // throw Exception
	        }
	        catch (ArithmeticException e) {
	            // Exception handler
	            System.out.println(
	                "Divided by zero operation cannot possible");
	        }
	    }
	}


