/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan36.target.saldo.tabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Target Saldo Tabungan
 */
public class Tabungan {
    int i = 1;
    float bunga;
    double saldoAwal,saldoTarget,saldo;
    
    public void tampilSaldoTabungan() {
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        bunga = (float) (bunga/100);
        
        while(i < saldoTarget){
            saldo = (saldoAwal * 0.08) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldo));
            saldoAwal = saldo;
            if (saldoAwal >= saldoTarget) {
                break;
            }i++;
        }
    }
    

}
