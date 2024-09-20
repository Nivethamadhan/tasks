package tasks.tasks_7;

public class StringIndexBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello";
		 try {
	            // Attempting to access an invalid index (e.g., 5, which is out of bounds)
	            System.out.println(text.charAt(5));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException caught!");
	            System.out.println("Error message: " + e.getMessage());
	        }
	}

}
