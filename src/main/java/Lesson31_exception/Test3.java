package Lesson31_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception{
        File f = new File("test9.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
