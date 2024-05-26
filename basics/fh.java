
import java.io.BufferedInputStream;
import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.InputStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fh {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // InputStreamReader isr = new InputStreamReader(System.in);
        // int i =isr.read();
        // // int n = br.read();
        // System.out.println((char)i);

        File file = new File("./newFile.txt");
        FileInputStream fin=new FileInputStream(file);
        BufferedInputStream bin =new BufferedInputStream(fin);
        try {
            if (file.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }

        } catch (IOException e) {
            System.out.println("file not created");
            System.out.println(e.getMessage());
            bin.close();
            return;
        }

        // try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
        //     writer.append("this contentent is written using filewriter and bufferwriter");
        //     System.out.println("Content written to the file.");
        // } catch (IOException e) {
        //     System.out.println("An error occurred while writing to the file.");
        //     e.printStackTrace();
        // }

        // BufferedWriter writer = new BufferedWriter(new FileWriter("newFile.txt"));
        // writer.write("this contentent is written using filewriter and bufferwriter");


        FileWriter fwriter = new FileWriter(file);
        fwriter.write("hello mfdmhskjsd");
        fwriter.close();
        BufferedReader reader = new BufferedReader(new FileReader("newFile.txt"));
        FileReader fReader = new FileReader(file);
        long size=file.length();
        for(int i=(int)size-1;i>=0;i--)
        {
            bin.mark(i);
            bin.skip(i);
            System.out.print((char)bin.read());
            bin.reset();

        }
        // while (fReader.ready()) {
        //     System.out.println(fReader.read());
        // }
        // System.out.println();
        

        // BufferedReader reader = new BufferedReader(new FileReader("newFile.txt"));
        // String s =reader.readLine();
        // System.out.println(s);
        reader.close();
        bin.close();
        fReader.close();
    }
}
