/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.function;

/**
 *
 * @author ASUS
 */
public class MethodOverloading {
     public static void main(String[] args) {
        double p = 9;
        double l = 6.4;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);
        int pn = 9;
        int lb = 6;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = " + hsl);
    }
    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
