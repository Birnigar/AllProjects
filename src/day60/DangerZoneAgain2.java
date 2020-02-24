package day60;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneAgain2 {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("The start");

            readMyFile();

        Thread.sleep(3000);
        System.out.println("The end");





    }
    public static void readMyFile()  {
        System.out.println("Reading the file in my computer");

        try {
             throw new FileNotFoundException("File is not here");
            //       List<String>allLines= Files.readAllLines(Paths.get("hero.txt"));
            //      System.out.println("allLines = " + allLines);

        }catch (FileNotFoundException e){
       // }catch (IOException e){
            System.out.println("Aha !! Caught you in readMyfile");
    }



}
}
