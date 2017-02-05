package com.pakjivega.tsp;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.pakjivega.tsp.bean.City;
import com.pakjivega.tsp.bruteforce.ResolverBrute;

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
        Set<City> cities = new HashSet<City>();
        for (String line : lines) {
        	City city= new City();
            String[] array = line.split(",");
            city.setEstate(array[0]);
            System.out.print(array[0]);
            city.setCityname(array[1]);
            System.out.print(array[1]);
            city.setLatitude(Long.valueOf(array[2]));
            System.out.print(array[2]);
            city.setLongitude(Long.valueOf(array[3]));
            System.out.println(array[3]);
            cities.add(city);
        }
        System.out.println(cities.size());
        Resolver resolver = new ResolverBrute();
        ArrayList<City> path = resolver.resolve(cities);
        
    }
}
