/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan27.hurufbesarkecil;

import java.util.Scanner;
/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Huruf Besar Kecil
 */
public class IF110118021Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kalimat;
        String hurufBesar;
        String hurufKecil;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine();
        
        hurufBesar = kalimat.toUpperCase();
        hurufKecil = kalimat.toLowerCase();
       
        System.out.println("\nHasil Formatting");
        System.out.println("Huruf Besar : "+ hurufBesar);
        System.out.println("Huruf Kecil : "+ hurufKecil);
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
    
}
