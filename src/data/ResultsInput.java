package data;

import java.util.ArrayList;
import java.util.Scanner;


public class ResultsInput {


    public ArrayList<Person> start() {

        Scanner scan = new Scanner(System.in);

        ArrayList<Person> personArrayList = new ArrayList<>();

        String word = null;

        do {
            Person person = new Person();
            System.out.println("Wprowadź gracza (imię nazwsko wynik) lub stop");
            word = scan.nextLine();
            if (word.equals("stop")) {
                break;
            }
            String[] words = word.split(" ");
            person.setFirstName(words[0]);
            person.setLastName(words[1]);
            person.setScore(Double.parseDouble(words[2]));
            personArrayList.add(person);

        } while (!word.equals("stop"));

        return personArrayList;
    }

}
