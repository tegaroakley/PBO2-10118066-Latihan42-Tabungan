/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal \t\t: ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah Uang Yang Akan Diambil \t: ");
        System.out.println("Saldo Anda Sekarang \t\t: " + tabungan.ambilUang(scanner.nextInt()));
    }
    
}
