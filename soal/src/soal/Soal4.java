package soal;

import java.util.Scanner;

/**
 * @since 28/01/2023
 * @author Arnan
 */
public class Soal4 {
    
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);
    
        int penjualan, gaji = 500000;
        int bonus, total;
        
        penjualan = Scan.nextInt();
        
        if (penjualan >= 80)
        {
            bonus = (int) (50000 * penjualan * 0.35);
            total = gaji + bonus;
        }
        else if (penjualan >= 40)
        {
            bonus = (int) (50000 * penjualan * 0.25);
            total = gaji + bonus;
        }
        else if(penjualan >= 15)
        {
            bonus = (int) (50000 * penjualan * 0.10);
            total = gaji + bonus;
        }
        else
        {
            bonus = (int) (50000 * (15 - penjualan) * 0.15);
            total = gaji - bonus;
        }
        System.out.println(total);
    }
}
