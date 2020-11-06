/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan36.target.saldo.tabungan;
import java.util.Scanner;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Target Saldo Tabungan
 */
public class PBOIF210119082Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        System.out.print("Saldo Awal : RP. ");
        tabungan.saldoAwal = scanner.nextDouble();
        
        System.out.print("Bunga/Bulan(%) : ");
        tabungan.bunga = scanner.nextFloat();
        
        System.out.print("Saldo Target : RP. ");
        tabungan.saldoTarget = scanner.nextDouble();
        System.out.println();
        tabungan.tampilSaldoTabungan();
    }
    
}
