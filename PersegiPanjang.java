package com.belajar;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    public double getPanjangg(){
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    private double lebar;
    public double getLebar(){
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        return (2*panjang)+(2*lebar);
    }

    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }
}
