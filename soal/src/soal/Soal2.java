package soal;

import java.util.Scanner;

/**
 * @since 28/01/2023
 * @author Arnan
 */
public class Soal2 {
    
    public static void main (String []args)
    {
    String[] kata;
    int[] nilai;
    
    Scanner Scan = new Scanner(System.in);
    
    kata = new String[3];
    nilai = new int[3];
    
    for (int i = 0; i < 3; i++){
        kata[i] = Scan.next();
        nilai[i] = Scan.nextInt();
    }
    for (int i = 0; i < 32; i++){
            System.out.print("=");
        }
    System.out.println("");
    for (int i = 0; i < 3; i++)
    {
        if(nilai[i] >= 100)
        {
        System.out.println(kata[i] + "\t\t " + nilai[i]);
        } 
        else if (nilai[i] >= 10)
        {
        System.out.println(kata[i] + "\t\t 0" + nilai[i]); 
        }
        else
        {
        System.out.println(kata[i] + "\t\t 00" + nilai[i]);
        }
    }
    for (int i = 0; i < 32; i++){
            System.out.print("=");
        }
    } 
}
