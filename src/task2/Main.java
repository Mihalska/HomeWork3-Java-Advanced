package task2;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // створюємо файл  та записуємо дані;
        File file = new File("C:\\Users\\Public\\Homework4.3\\src\\task2\\fail");
        PrintWriter pw = new PrintWriter(new FileWriter(file , true ) );
        pw.println("Записуємо дані");
        pw.println("Закінчили записувати. OK");
        pw.flush() ;
        pw.close() ;
        //відкриваємо знову файл та зчитуємо
        BufferedReader text = new BufferedReader(new FileReader(file ) );
        String temp ;
        while ((temp = text.readLine() ) != null) {
            //виводимо дані в консоль
            System.out.println(temp );
        }
        text.close() ;
    }
}
