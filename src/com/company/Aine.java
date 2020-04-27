package com.company;

public class Aine {

    private String kood;
    private String nimetus;
    private Integer EAP;

    public Aine(String kood, String nimetus, Integer EAP) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.EAP = EAP;
    }

    @Override
    public String toString() {
        return "Aine{" +
                "kood='" + kood + '\'' +
                ", nimetus='" + nimetus + '\'' +
                ", EAP=" + EAP +
                '}';
    }

    public String getKood() {
        return kood;
    }

    public void setKood(String kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public Integer getEAP() {
        return EAP;
    }

    public void setEAP(Integer EAP) {
        this.EAP = EAP;
    }

    public Integer tundideArv(){
        return EAP * 8;
    }
}
