package app;

import data.Person;
import data.ResultFiltering;
import data.ResultsInput;
import data.ResultsWrittingToCSV;

import java.io.IOException;
import java.util.ArrayList;


public class Test {

    public static void main(String[] args) throws IOException {

        ResultsInput results = new ResultsInput();
        ResultFiltering filter = new ResultFiltering();
        ResultsWrittingToCSV resultCSV = new ResultsWrittingToCSV();


        ArrayList<Person> persons = results.start();

        filter.sorting(persons);

        resultCSV.writeCSV(persons);


    }
}
