import java.io.*;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.util.Scanner;

public class ReadZip{

    public static void main(String[] args) throws IOException{
        Scanner pathIn = new Scanner(System.in);
        System.out.println("Please enter source zip path:");
        String srcZip = pathIn.nextLine();
        pathIn.close();
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(srcZip))) {
            try(ZipOutputStream destZip = new ZipOutputStream(new FileOutputStream("./06.zip"))){
            ZipEntry entry = null;
            while ((entry = zip.getNextEntry()) != null) {
                String name = entry.getName();
                if (!entry.isDirectory()) {
                        int n;
                        byte[] buffer = new byte[11];
                        while ((n = zip.read(buffer)) != -1) {
                            destZip.putNextEntry(entry);
                            destZip.write(buffer);
                        }
                    }
                }
            destZip.close();
            }
            zip.close();
        }
    }
}