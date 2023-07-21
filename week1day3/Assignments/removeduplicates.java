package week1day3.Assignments;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] arraystring=text.split(" ");
		for(int i=0;i<arraystring.length;i++)
		{
		int j;
		//int count=0;
			for( j=i+1;j<arraystring.length;j++)
			{
				if(arraystring[i].equals(arraystring[j]))
				{
					System.out.println(arraystring[j]);
					//count++;
				}
				else
				{
					//System.out.println(arraystring[j]);
				}
			}
					
		}
			//if(j==i)
			//{
			//	arraystring[count++]=arraystring[i];
			//}
	}
	
		
}
	


