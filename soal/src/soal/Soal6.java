package soal;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @since 29/01/2023
 * @author Arnan
 */
public class Soal6 {
    
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);
    
        String nilai1, nilai2;
        
        nilai1 = Scan.nextLine();
        nilai2 = Scan.nextLine();
        
        BigInteger number1 = new BigInteger(nilai1);
        BigInteger number2 = new BigInteger(nilai2);
       
        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
    }
}
