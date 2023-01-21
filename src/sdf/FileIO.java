package sdf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String dirPath = "data/";
        String fileName = "data.txt";

        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();


        // create directory
        if(isDirCreated){
            System.out.println("New Directory "+dirPath+" created");
        }else {
            System.out.println("Directory "+dirPath+" already exists");
        }

        // create a file in the 
        File newFile = new File(dirPath+File.separator+fileName);
        boolean isFileCreated = newFile.createNewFile();

        if(isFileCreated)
            System.out.println("New File "+fileName+" is created");
        else
            System.out.println("File "+fileName+" already exits");
        
        File fileList[] = newDir.listFiles();
        for (File f: fileList){
            System.out.println("File "+f.getPath()+":"+f.getCanonicalFile());
        }

        FileWriter fw = new FileWriter(newFile);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i<10; i++){
            bw.write(Integer.toString(i)+"\n");
        }

        String welcomeMesage = "Welcome to ISS TFIP";

        bw.write(welcomeMesage);
        bw.flush();

        bw.close();
        fw.close();

    }
    
}
