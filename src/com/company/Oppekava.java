package com.company;

import java.util.Arrays;

public class Oppekava {

    private String oppekavaKood;
    private String oppekavaNimetus;
    private Aine [] ained;

    public Oppekava(String oppekavaKood, String oppekavaNimetus, Aine[] ained) {
        this.oppekavaKood = oppekavaKood;
        this.oppekavaNimetus = oppekavaNimetus;
        this.ained = ained;
    }

    @Override
    public String toString() {
        return "Oppekava{" +
                "oppekavaKood='" + oppekavaKood + '\'' +
                ", oppekavaNimetus='" + oppekavaNimetus + '\'' +
                ", ained=" + Arrays.toString(ained) +
                '}';
    }

    public Integer getOppekavaMaht(){
        Integer maht = 0;
        for (Aine aine : ained){
            maht += aine.getEAP();
        }
        return maht;
    }

    public String getOppekavaNimetus() {
        return oppekavaNimetus;
    }

    public void setOppekavaNimetus(String oppekavaNimetus) {
        this.oppekavaNimetus = oppekavaNimetus;
    }

    public String getOppekavaKood() {
        return oppekavaKood;
    }

    public void setOppekavaKood(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }

    public Aine[] getAined() {
        return ained;
    }

    public void setAined(Aine[] ained) {
        this.ained = ained;
    }
}
