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
public class InputFunction {
     public static void main(String[] args) {
        // memanggil fungsi
        hitungLuas(9, 6.4);
    }
    public static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
    
}
