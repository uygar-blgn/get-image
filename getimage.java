import java.net.URL;
import java.util.Scanner;
import java.net.URL;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;

public class getimage
{
    public static void main(String[] args) throws Exception
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String URL = console.nextLine();
        URL page = new URL(URL);
        InputStream in = page.openStream();
        System.out.print("Enter file name: ");
        String fileName = console.nextLine();
        console.close();
        FileOutputStream out = new FileOutputStream("C:\\" + fileName);
        boolean done = false;
        while(!done)
        {
            int input = in.read();
            if(input == -1)
            {
                done = true;
            }
            else
            {
                out.write(input);
            }
        }
        out.close();
    }
}