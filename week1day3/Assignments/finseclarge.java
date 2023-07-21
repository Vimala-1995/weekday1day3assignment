package week1day3.Assignments;

import java.util.Arrays;

public class finseclarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {3,2,11,4,6,7};
		Arrays.sort(number);
		int size=number.length;
		int result=number [size-2];
		System.out.println("the second largest number is"+result+"");
		
	}

}
