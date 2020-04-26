package com.company;

import java.util.*;


public class Main {

    static FileReader fileReader = new FileReader();
    static List<String> fileRows;
    static Map<String, List<Integer>> temperatureMap = new HashMap<String, List<Integer>>();

    static int nthLastIndexOf(int nth, String ch, String string) {
        if (nth <= 0) return string.length();
        return nthLastIndexOf(--nth, ch, string.substring(0, string.lastIndexOf(ch)));
    }

    static void promptEnterKey(){
        System.out.println("\nPress \"ENTER\" to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    static void printTemperatures(List<Integer> temperatures){
        Integer max = Collections.max(temperatures);
        Integer min = Collections.min(temperatures);
        double sum = temperatures.stream().mapToInt(Integer::intValue).sum();
        double average = sum / temperatures.size();
        double trimmedAverage = (sum - min - max) / (temperatures.size() - 2);

        System.out.println(String.format("Max temp %s\nMin temp %s\nAverage temp %s\nTrimmed average temp %s", max, min, average, trimmedAverage));
    }

    public static void main(String[] args) throws Exception {
        try{
            fileRows = fileReader.readFile(args[0]);
        }
        catch (Exception e){
            System.out.println("invalid file path ");
            System.exit(0);
        }

        for (String line : fileRows){
            String key = line.substring(0, nthLastIndexOf(5, " ", line));
            String[] valueStringArray = line.substring(nthLastIndexOf(5, " ", line)+1).split(" ");
            List<Integer> value = new ArrayList<>();
            for(String s : valueStringArray) value.add(Integer.valueOf(s));

            temperatureMap.put(key, value);
        }


        for (String key : temperatureMap.keySet()) {
            promptEnterKey();
            System.out.println(String.format("Temperature data about %s", key));
            printTemperatures(temperatureMap.get(key));
        }
        System.out.println("\nEnd of file");
    }
}
