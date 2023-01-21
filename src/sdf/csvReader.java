package sdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class csvReader {

    public static List<String> readFile(File readFile) throws IOException{
        List<String> tempList = new LinkedList<String>();

        FileReader fr = new FileReader(readFile);
        BufferedReader br = new BufferedReader(fr);
        String line = "";

        while((line=br.readLine())!=null){
            tempList.add(line);
        }

        br.close();
        fr.close();

        System.out.println("File read");

        return tempList;        
    }
    
}
