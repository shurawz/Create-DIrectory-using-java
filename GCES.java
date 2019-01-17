import java.io.*;

class GCES	
{
	public static void main(String[] args) throws Exception
	{
		FileWriter f = new FileWriter("C://Users//dell//Desktop//GCES//gces1.txt");
		BufferedWriter wFb = new BufferedWriter(f);
		//BufferedWriter wFb = new BufferedWriter(new FileWriter("C:User//dell//Desktop//gces1.txt"));
		
		wFb.write("gces");
		wFb.newLine();

		wFb.write("2019");
		wFb.newLine();

		wFb.write("Happy new year");
	//	wFb.close();
		System.out.println("Successfully wrote.");

		}
}