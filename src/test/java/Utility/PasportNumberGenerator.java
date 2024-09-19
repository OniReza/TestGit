package Utility;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.IOException;



public class PasportNumberGenerator {

    public static Faker fake = new Faker();

    public static String passportno;

    public static void main(String[] args) throws IOException {

        int n = 5;
        for (int i = 1; i <= n; ++i) {

        int number = fake.number().numberBetween(10000000, 99999999);
        passportno = "A"+number;
       // System.out.println(passportno)

            System.out.println(passportno);
        }

    }


}
