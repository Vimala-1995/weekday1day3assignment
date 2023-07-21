package week1day3.Assignments;

import java.util.Arrays;

public class duplicateinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		int arraylength=arr.length;
		int count;
		for(int i=0;i<arraylength-1;i++)
		{
			count=0;
			for(int j=0;j<i;j++)
			{
				
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
				{
					
				}
				
				
			}
			
			}
			
		}
		}
	


