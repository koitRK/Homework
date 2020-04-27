package com.company;

public class Main {

    public static void main(String[] args) {

        Aine aine1 = new Aine("RT-001", "ETTEVÕTLUSMOODUL", 15);
        Aine aine2 = new Aine("RT-002", "ENESEJUHTIMINE", 4);
        Aine aine3 = new Aine("RT-003", "KOOSTÖÖMUDELID", 2);
        Aine aine4 = new Aine("RT-004", "SUHTLEMISPSÜHOLOOGIA", 4);

        Aine[] ained = new Aine[]{aine1, aine2, aine3, aine4};

        for (Aine aine : ained){
            System.out.println(aine.toString());
        }

        Oppekava oppekava1 = new Oppekava("207866", "ROOBOTIKATARKVARA ARENDUS", ained);

        System.out.println(oppekava1.toString());
        System.out.println(oppekava1.getAined()[0].tundideArv());
        System.out.println(oppekava1.getOppekavaMaht());
    }
}
