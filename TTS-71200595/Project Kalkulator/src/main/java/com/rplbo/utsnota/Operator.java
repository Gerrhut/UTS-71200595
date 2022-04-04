package com.rplbo.utsnota;

public class Operator {
    private String operatorString;
    private String operatorSymbol;

    public Operator(String x) {
        double result;
        String help = x.toLowerCase();
        if (help.equals("tambah")){
            this.operatorSymbol = "+";
        } else if (help.equals("kali")){
            this.operatorSymbol = "*";
        } else if (help.equals("bagi")){
            this.operatorSymbol = "/";
        } else if (help.equals("pangkat")){
            this.operatorSymbol = "^";
        } else if (help.equals("kurang")) {
            this.operatorSymbol = "-";
        }

    }

    public String getOperatorSimbol() {
        return operatorSymbol;
    }
}
