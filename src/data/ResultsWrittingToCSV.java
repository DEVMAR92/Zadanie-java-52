package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ResultsWrittingToCSV {

    public void writeCSV(ArrayList<Person> personArrayList) throws IOException {


        File file = new File("wyniki.csv");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter("wyniki.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < personArrayList.size(); i++) {
            String fName = personArrayList.get(i).getFirstName();
            String lName = personArrayList.get(i).getLastName();
            String scr = Double.toString(personArrayList.get(i).getScore());
            bufferedWriter.write(fName + ";" + lName + ";" + scr + ";");
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        System.out.println("Dane zapisano do pliku CSV");

    }
}
