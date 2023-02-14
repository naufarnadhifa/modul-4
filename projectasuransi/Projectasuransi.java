/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum.projectasuransi;

/**
 *
 * @author NAUFA ARNADHIFA
 */
public class Projectasuransi {

    public static void main(String[] args) {
        Satpam S = new Satpam("Rendra","0042","Jl. Itik 15",2000,300000,5);
        Sales T = new Sales("Wibisana","0185","Jl. Ayam 78",2006,500000,10);
        Manajer M = new Manajer("Adi","0005","Jl. Angsa 56" ,1999 ,1500000 ,"Keuangan");
        System.out.println("\n\n==DISPLAY DATA KARYAWAN==");
        System.out.println("");
        S.CetakSatpam();
        System.out.println("");
        T.CetakSales();
        System.out.println("");
        M.CetakManajer();
    }
}
    
