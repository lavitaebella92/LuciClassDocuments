package day35_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowException {

    public static void main(String[] args) throws FileNotFoundException {

//        try {
//            methodB();
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        methodB();

    }

    public static void methodA() {
        File file = new File("location");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {

            System.out.println("FileNotFoundException");

        }
    }

    public static void methodB() throws FileNotFoundException {
        File file = new File("location");

        FileReader fr = new FileReader(file);

    }

    public static void methodC() throws FileNotFoundException {
        methodA();
        methodB();
    }

    public static void methodD() {
        try {
            methodC();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}