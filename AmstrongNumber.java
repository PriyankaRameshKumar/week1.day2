package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 153;
		int value = input;
		int sum = 0;
		int rem;

		while(input >0)
		{

			rem = input % 10;
			rem = rem*rem*rem;
			sum = rem +sum;
			input = input /10;

		}
		if(sum==value)
		{
			System.out.println(sum + " Is an Amstrong number");
		}
		else
		{
			System.out.println( sum + " Is not an amstrong number");
		}
	}

}
