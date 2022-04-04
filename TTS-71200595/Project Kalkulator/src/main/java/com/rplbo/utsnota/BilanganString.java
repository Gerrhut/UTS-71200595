package com.rplbo.utsnota;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String angka) {
        if (angka.length() <= 17) {
            String help = angka.toLowerCase();
            if (help.equals("Satu")) {
                this.bilangan = 1;
            } else if (help.equals("dua")) {
                this.bilangan = 2;
            } else if (help.equals("tiga")) {
                this.bilangan = 3;
            } else if (help.equals("empat")) {
                this.bilangan = 4;
            } else if (help.equals("lima")) {
                this.bilangan = 5;
            } else if (help.equals("enam")) {
                this.bilangan = 6;
            } else if (help.equals("tujuh")) {
                this.bilangan = 7;
            } else if (help.equals("delapan")) {
                this.bilangan = 8;
            } else if (help.equals("sembilan")) {
                this.bilangan = 9;
            } else if (help.equals("sepuluh")) {
                this.bilangan = 10;
            } else if (help.equals("sebelas")) {
                this.bilangan = 11;
            } else if (help.equals("dua belas")) {
                this.bilangan = 12;
            } else if (help.equals("tiga belas")) {
                this.bilangan = 13;
            } else if (help.equals("empat belas")) {
                this.bilangan = 14;
            } else if (help.equals("lima belas")) {
                this.bilangan = 15;
            } else if (help.equals("enam belas")) {
                this.bilangan = 16;
            } else if (help.equals("tujuh belas")) {
                this.bilangan = 17;
            }
        }

    }

    public int getBilangan() {
        return bilangan;
    }

    public boolean apakahDuaDigit() {
        boolean state;
        String bantu = Integer.toString(getBilangan());
        if (bantu.length() > 1) {
            state = true;
        } else {
            state = false;
        }
        return state;
    }

    public boolean apakahLebihDari10() {
        boolean state;
        if (getBilangan() > 10) {
            state = true;
        } else {
            state = false;
        }
        return state;
    }
}