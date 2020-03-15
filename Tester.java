package com.belajar;

public class Tester {
    public static void main(String[] args) {
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.setPanjang(10);
        persegipanjang.setLebar(5);
        System.out.println("Keliling Persegi Panjang = "+persegipanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang = "+persegipanjang.hitungLuas());

        SegitigaSamaSisi SSS = new SegitigaSamaSisi();
        SSS.setA(10);
        SSS.setT(7.07);
        System.out.println("Keliling Segitiga Sama Sisi = "+SSS.hitungKeliling());
        System.out.println("Luas Segitiga Sama Sisi = "+SSS.hitungLuas());
    }
}
