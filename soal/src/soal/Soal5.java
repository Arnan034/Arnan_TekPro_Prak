package soal;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 * @since 29/01/2023
 * @author Arnan
 */
public class Soal5 {
    
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);
    
        long gabungan = 0;
        int[] mobil;
        int pangkat = 0;
        mobil = new int[4];
        
        for(int i = 0; i < 4; i++)
        {
            mobil[i] = Scan.nextInt();
        }
        for (int i = 3; i >= 0; i--)
        {
            
            gabungan += (mobil[i]* pow(10,pangkat));
            if(mobil[i] >= 1000){
                pangkat += 4;
            }
            else if (mobil[i] >= 100)
            {
                pangkat += 3;
            }
            else if(mobil[i] >= 10)
            {
                pangkat += 2;
            }
            else 
            {
                pangkat += 1;
            } 
        }
        gabungan -= 999999;
        if(gabungan % 5 == 0)
        {
         System.out.println("jalan");   
        }
        else 
        {
            System.out.println("berhenti");
        }
    }
}
