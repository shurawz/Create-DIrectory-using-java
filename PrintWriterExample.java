import java.io.*;

class PrintWriterExample
{
	public static void main(String[] args) throws Exception
	{
		FileWriter  writer      = new FileWriter("C://Users//dell//Desktop//GCES//report.txt");
		PrintWriter printWriter = new PrintWriter(writer);

		printWriter.print(true);
		printWriter.print((int) 123);
		printWriter.print((float) 123.456);

		printWriter.printf( "Text + data: %1$", 123);

		printWriter.close();
	}
}