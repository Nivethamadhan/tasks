package tasks.task_4;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
System.out.println("enter the age");	
int age = scanner.nextInt();
if(age>=60) {
	System.out.println("The person is senior citizen");}
	else
	{
		System.out.println("The person is not citizen");
}
	}

}
