package tasks.task_4;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);

System.out.println("Enter a number a");
int a = reader.nextInt();

System.out.println("Enter a number b");
int b = reader.nextInt();

System.out.println("Before swapping: the value of a is  " + a + " the value of b is " + b);

int temp=a;
a=b;
b=temp;

System.out.println("After swapping: the value of a is " + a + " the value of b is " + b);

	}

}
