package buoi12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.ScatteringByteChannel;

public class hw07 {
    public static void main (String[] args) throws FileNotFoundException {
        String path ="C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled1\\src\\buoi12\\output.txt";
        String note = "cơn mua mèng méng";

        try(PrintWriter writer = new PrintWriter(path)){
            writer.write(note);
            System.out.println("done");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
