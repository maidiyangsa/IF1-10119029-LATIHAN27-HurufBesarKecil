/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurufbesarkecil;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program merubah huruf kecil dan besar, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        nama = scanner.next();
        
        System.out.println();
        System.out.println("Huruf Besar : ".concat(nama.toUpperCase()));
        System.out.println("Huruf Besar : ".concat(nama.toLowerCase()));
    }
    
}
