package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader{

    public List<String> readFile(String path) throws Exception{
        List<String> fileRows = new ArrayList<>();
        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            fileRows.add(sc.nextLine());
        }
        return  fileRows;
    }
}