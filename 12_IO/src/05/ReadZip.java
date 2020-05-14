import java.io.*;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import java.util.Scanner;

public class ReadZip{

    public static void main(String[] args) throws IOException{
        Scanner pathIn = new Scanner(System.in);
        System.out.println("Please enter source zip path:");
        String srcZip = pathIn.nextLine();
        pathIn.close();
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(srcZip))) {
            ZipEntry entry = null;
            while ((entry = zip.getNextEntry()) != null) {
                String name = entry.getName();
                if (!entry.isDirectory()) {
                    int n;
                    while ((n = zip.read()) != -1) {
                        System.out.println((char) n);
                    }
                }
            }
        }
    }
}