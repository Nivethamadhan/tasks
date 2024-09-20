package tasks.tasks_7;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> languages = new ArrayList<>();

		//Add elements to ArrayList
		languages.add("Java"); 
		languages.add("Ruby");
		languages.add("Python");
		languages.add("CSharp");
		
		int s=languages.size();
		
		String[] arr=new String[s];
		
		// Convert list to array
		languages.toArray(arr);
		///arr[5]="Ruby";  // Will give indexoutofboundexception
		
	    for (String r:arr) {
			System.out.println(r);
		}
		

	}

}
