package tasks.tasks_7;

public class IndexBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayIndexBound Exception
		int arr[]= {1,2,3,4,5};
		try {
		for(int i=0;i<=arr.length;i++)
		{
	System.out.println(arr[i]);

}}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e.getMessage());
        }
 
	}}