package week1.day2.assignments;

public class Calculator {

	public int add(int num1 , int num2, int num3)
	{
		int sum = num1 + num2 + num3;
		return sum;
	}
	public int sub(int num1 , int num2)
	{
		int diff = num1 - num2 ;
		return diff;
	}
	public double mul(double num1 , double num2)
	{
		double product = num1 * num2 ;
		return product;
	}
	public float div(float num1 , float num2)
	{
		float division = num1 / num2;
		return division;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();

	}

}
