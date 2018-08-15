package data;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getScore() > p2.getScore())
            return 1;
        else if (p1.getScore() == p2.getScore())
            return 0;
        else return -1;
    }
}
