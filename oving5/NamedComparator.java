package oving5;

import java.util.Comparator;

public class NamedComparator implements Comparator<Named> {

    @Override
    public int compare(Named name1, Named name2) {
        Integer i = name1.getFamilyName().compareTo(name2.getFamilyName());

        if (i != 0) {
            return i;

        } else {
            return name1.getGivenName().compareTo(name2.getGivenName());
        }
    }

}
