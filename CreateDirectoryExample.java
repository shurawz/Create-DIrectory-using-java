import java.io.*;

public class CreateDirectoryExample {

    public static void main(String[] args) throws IOException
    {
        File f = new File("C://Users//dell//Desktop//GCES");
        f.mkdir();

        File fobj = new File("C://Users//dell//Desktop//GCES//Suraj.txt");
        fobj.createNewFile();
    }

}
