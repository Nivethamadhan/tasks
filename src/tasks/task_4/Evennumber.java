package tasks.task_4;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner a = new Scanner(System.in);
     System.out.println("Enter a number");
     int num = a.nextInt();
     if(num % 2 == 0) {
    	 System.out.println("the number is even number");
     }
	}

}
