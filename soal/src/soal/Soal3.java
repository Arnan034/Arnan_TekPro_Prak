package soal;

import java.util.Scanner;

/**
 * @since 28/01/2023
 * @author Arnan
 */
public class Soal3 {
    
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);
    
        int nilai1, nilai2;
        char operasi;
      
        nilai1 = Scan.nextInt();
        operasi = Scan.next().charAt(0);
        nilai2 = Scan.nextInt();
        
        switch (operasi)
        {
            case '+' : System.out.println(nilai1 + nilai2); break;
            case '-' : System.out.println(nilai1 - nilai2); break;
            case '*' : System.out.println(nilai1 * nilai2); break;
            case '/' : if (nilai1 % nilai2 == 0)
                        {
                            System.out.println(nilai1 + nilai2); break;
                        }
                        else
                        {
                            System.out.println("Pembagian tidak habis dibagi 0 maka diambil nilai tanpa , yaitu : "+ nilai1 / nilai2);
                        }break;
            case '%' : System.out.println(nilai1 % nilai2); break;
            default : System.out.println("Operasi Tidak Valid");
        }
    }
}
