package com.pakjivega.tsp;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Travel 
{
    public static void main( String[] args ) throws Exception
    {
    	File file = new File("src/test/resources/distances.txt");
    	List<String> lines = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
        System.out.println( "Hello World!" );
        for (String line : lines) {
            String[] array = line.split(",");
            System.out.print(array[0]);
            System.out.print(array[1]);
            System.out.print(array[2]);
            System.out.println(array[3]);
        }
        
    }
}
