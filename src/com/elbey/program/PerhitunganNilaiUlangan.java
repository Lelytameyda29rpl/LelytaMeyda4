/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elbey.program;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class PerhitunganNilaiUlangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nama,grade;
        double nilaitugas,nilaikuis,nilaiuts,nilaiuas,nilaiakhir;
        
        System.out.println("Menghitung Nilai Ulangan Siswa");
        System.out.println("------------------------------");
        System.out.println("Masukkan Nama:");
        nama = input.nextLine();
        System.out.println("Nilai Tugas:");
        nilaitugas = input.nextInt();
        System.out.println("Nilai Kuis:");
        nilaikuis = input.nextInt();
        System.out.println("Nilai UTS:");
        nilaiuts = input.nextInt();
        System.out.println("Nilai UAS:");
        nilaiuas = input.nextInt();
        nilaiakhir =(0.15 * nilaitugas + 0.20* nilaikuis + 0.30 * nilaiuts + 0.35 * nilaiuas);
        System.out.println("Nilai Akhir: " +nilaiakhir);
        
        if (nilaiakhir > 90){
            grade = "A";
        }else if (nilaiakhir > 80){
            grade = "B+";
        }else if (nilaiakhir > 70){
            grade = "B";
        }else{
            grade = "F";
        }
        System.out.println("Grade: "+grade);
        
        
    }
    
}
