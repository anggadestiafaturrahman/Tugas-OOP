package com.belajar;

public class SegitigaSamaSisi extends BangunDatar {
    private double a;

    public double getA(){

        return a;
    }

    public void setA(double a){
        this.a = a;
    }
    private double t;

    public double getT(){

        return t;
    }

    public void setT(double t){
        this.t = t;
    }
    @Override
    public double hitungKeliling(){
        return 3*a;
    }

    @Override
    public double hitungLuas() {
        return 0.5*a*t;
    }
}
