package week1day3.Assignments;

public class reverseeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester"; 
		String[]split=test.split(" ");
		for(int i=0;i<split.length;i++)
		{
		if(i%2==0) {
			char[] chararray=split[i].toCharArray();
			for(int j=chararray.length-1;j>=0;j--) {
				System.out.println(chararray[j]);
			}
		}
			else
			
			{	
				System.out.println(split[i]);
			}
		}
	}
}



