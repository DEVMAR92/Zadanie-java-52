package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ResultFiltering {

    public void sorting(ArrayList<Person> personArrayList) {

        Scanner scan = new Scanner(System.in);

        FirstNameComparator firstNameComparator = new FirstNameComparator();
        LastNameComparator lastNameComparator = new LastNameComparator();
        ScoreComparator scoreComparator = new ScoreComparator();

        System.out.println("Podaj algorytm sortowania(imie/nazwisko/wynik)");

        String input = scan.nextLine();

        switch (input) {
            case "imie":
                Collections.sort(personArrayList, firstNameComparator);
                break;
            case "nazwisko":
                Collections.sort(personArrayList, lastNameComparator);
                break;
            case "wynik":
                Collections.sort(personArrayList, scoreComparator);
                break;
            default:
                System.err.println("Błąd");
                break;
        }


    }



}
