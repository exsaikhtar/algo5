/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exa2;
public class Programmer extends Pegawai {
    private int lamaBekerja;
    private double gaji;

    public Programmer(String Nama, String jenisKelamin, String noPegawai, boolean menikah, int lamaBekerja, double gaji) {
        super(Nama, jenisKelamin, noPegawai, menikah);
        this.lamaBekerja = lamaBekerja;
        this.gaji = gaji;
    }

    public double getBonus() {
        if (lamaBekerja < 5) {
            return 0.05 * gaji; // 5% dari gaji
        } else {
            return 0.10 * gaji; // 10% dari gaji
        }
    }

    @Override
    public void toShow() {
        super.toShow();
        System.out.println("Lama Bekerja: " + lamaBekerja + " tahun");
        System.out.println("Gaji: " + gaji);
    }
}
