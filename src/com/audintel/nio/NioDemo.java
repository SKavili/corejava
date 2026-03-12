package com.audintel.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
        import java.nio.charset.Charset;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.List;
public class NioDemo
{
    public static void main(String[] args)
    {
        Path p = Paths.get("C:\\D\\useful-skaviligit.txt");
        String que = "Java nio";
        Charset ch = Charset.forName ("ISO-8859-1");
        try {
            Files.write (p, que.getBytes ());
            List<String> ln = Files.readAllLines (p, ch);
            for (String line : ln)
            {
                System.out.println (line);
            }
        }
        catch (IOException e) {
            System.out.println (e);
        }

        main1();
    }

    public static void main1()
    {

        String que = "Java nio111";
        Charset ch = Charset.forName ("ISO-8859-1");
        try {
            FileOutputStream fos =new FileOutputStream(new File("C:\\D\\useful-skaviligit.txt"));
            fos.write(que.getBytes ());

            FileInputStream fis = new FileInputStream(new File("C:\\D\\useful-skaviligit.txt"));
            byte[] b1 = fis.readAllBytes();
          String s1 = new String(b1);

            fos.write(que.getBytes ());
            byte[] b2 = fis.readAllBytes();

            System.out.println(s1);
        }
        catch (IOException e) {
            System.out.println (e);
        }
    }
}


