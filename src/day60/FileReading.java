package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileReading {
    public static void main(String[] args) throws IOException {

        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day60/note.txt"));

            for (String eachLine : allLines) {
                System.out.println(eachLine);
            }
        }catch (Exception e){
            System.out.println("Boom");
            System.out.println(e.getMessage());
        }











    }
}
