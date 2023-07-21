package week1day3.Assignments;

import java.util.Arrays;

public class missingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] Arr=  {1,2,3,4,7,6,8};
		Arrays.sort (Arr);
		int indexvar=0;
		for (int i=1;i<Arr[Arr.length-1];i++) 
		{
			if(i==Arr[indexvar])
			{
				indexvar++;
				
			}
			else
			{
				System.out.println(i);
			
		
				
			}
		
		}
	}

}
