package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int length = arr1.length;
		int length2 = arr2.length;

		for (int i = 0 ; i < length ; i++)
		{
			for(int j = 0 ; j < length2 ; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}

}
