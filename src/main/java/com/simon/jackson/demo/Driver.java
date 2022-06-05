package com.simon.jackson.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {

            //create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read json file and convert it to our movie pojo.
            Movie theMovie = mapper.readValue(new File("src/main/resources/sample.json"), Movie.class);

            // call methods on our pojo.
            System.out.println("Rank: "+theMovie.getRank());
            System.out.println("Title: "+theMovie.getTitle());
            System.out.println("Rate: "+theMovie.getRate());
            System.out.println("Year: "+theMovie.getYear());
            System.out.println(theMovie.toString());


        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
