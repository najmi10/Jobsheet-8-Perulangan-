/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanperulangan;
import java.util.Scanner;

/**
 *
 * @author ica
 */
public class LatihanPerulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat variabel dan scanner
        boolean running = true;
        int counter =0;
        String jawab;
        Scanner baca = new Scanner(System.in);
        
        while(running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");
            
            jawab = baca.nextLine();
            
            //cek jawabnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }
            counter++;
        }
        
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter +" kali");
        
    }
}   

