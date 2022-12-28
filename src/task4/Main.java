package task4;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Public\\Homework4.3\\src\\task4\\example");
        BufferedReader text = new BufferedReader(new FileReader(file ) );
        String temp ;
        while ((temp = text.readLine() ) != null) {
            System.out.println(temp );
        }
        text.close() ;

    }

}
