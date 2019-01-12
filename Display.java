import java.io.*;

class Display
{
	public static void main(String[] args) 
	{
		int i,count = 0;
		File f = new File("C://Users//dell//Desktop");
		String[] files = f.list();


		for ( i = 0 ; i < files.length ; i ++)
		{
			String tempName = files[i];
			System.out.println(tempName);
			count++;
		}
		System.out.println(count);
	}
}