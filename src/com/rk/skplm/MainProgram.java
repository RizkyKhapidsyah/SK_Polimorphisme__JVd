package com.rk.skplm;

public class MainProgram {
    public static void main(String[] args) {
        tampilData dataSaya = new tampilData();

        System.out.print("Nama Manusia     = ");
        dataSaya.cetakData("Rizky Khapidsyah");

        System.out.print("Tahun Lahir      = ");
        dataSaya.cetakData(1991);

        System.out.print("IPK              = ");
        dataSaya.cetakData(3.17);
    }
}

class tampilData {
    public void cetakData(String X) {
        System.out.println(X);
    }

    public void cetakData(int X) {
        System.out.println(X);
    }

    public void cetakData(double X) {
        System.out.println(X);
    }
}
