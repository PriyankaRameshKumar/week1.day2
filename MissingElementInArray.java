package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr  = {1,2,3,4,7,6,8,10};
		 Arrays.sort(arr);
		 int length = arr.length;
		 
		 for (int i = arr[0] ; i <= length ; i++) {
			 if (i!=arr[i-1])
			 {
				 System.out.println(i);
				 break;
			 }
		 }

	}

}
