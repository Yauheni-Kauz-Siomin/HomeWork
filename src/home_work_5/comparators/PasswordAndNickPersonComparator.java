package home_work_5.comparators;

import home_work_5.DTO.Person;

import java.util.Comparator;

public class PasswordAndNickPersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int lenghtComparison = Integer.compare(o1.getPassword().length(), o2.getPassword().length());
        if (lenghtComparison != 0) {
            return lenghtComparison;
        }
        return o1.getName().compareTo(o2.getName());
    }
}

