package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordFrequencyFromTheFile {
    public static void main(String[] args)  {


        try {
          List<String> file= Files.readAllLines(Paths.get("src/day63/map.txt"));
          String str=file.toString();
            System.out.println(CreateMethodWithMap.wordFrequency(str));
        }catch (IOException e){
            System.out.println("Erroorrr");
        }




    }
}
