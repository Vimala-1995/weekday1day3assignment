package week1day3.Assignments;

public class changeoddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] ch=test.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			if(i%2==0) 
			{
			System.out.println(Character.toUpperCase(ch[i]));	
			}
			else
			{
				System.out.println(Character.toLowerCase(ch[i]));
			}
			
		}
		
	}
}
