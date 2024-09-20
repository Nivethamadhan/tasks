package Task4;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, num = 673452;

	    while (num != 0) {
	       num = num/10;
	      	++count;
	    }

	    System.out.println("Number of digits: " + count);
	}

}
