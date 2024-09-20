package tasks.tasks_7;

import java.util.ArrayList;

public class RemoveArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();

		//Add elements to ArrayList
		languages.add("Java"); 
		languages.add("Ruby");
		languages.add("Python");
		languages.add("CSharp");
		
		System.out.println(languages);
		languages.removeAll(languages);
		System.out.println(languages);
	}

}
