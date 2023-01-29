package soal;

import java.util.Scanner;

/**
 * @since 28/01/2023
 * @author Arnan
 */
public class Soal1 {
    
    public static void main(String[] args) {
    String text;
    //membuat scan baru bernama scan;
    Scanner Scan = new Scanner(System.in);
    
    text = Scan.nextLine();
        String[] var = text.split("[ !,?._'@]");
    int jumlah = var.length;
    System.out.println(jumlah);
        for (String var1 : var) {
            System.out.println(var1);
        }
    }
    
}
