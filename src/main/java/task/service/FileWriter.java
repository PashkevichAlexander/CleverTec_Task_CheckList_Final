package task.service;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String check) {
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/Check.txt")) {
            // перевод строки в байты
            byte[] buffer = check.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("The Check has been written");
    }
}
