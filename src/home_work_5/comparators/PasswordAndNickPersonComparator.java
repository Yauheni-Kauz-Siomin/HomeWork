package home_work_5.comparators;

import home_work_5.DTO.Person;

import java.util.Comparator;

public class PasswordAndNickPersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = Integer.compare(o1.getPassword(), o2.getPassword());
        if (result == 0) {
            result = o1.getNick().compareTo(o2.getNick());
        }
        return result;
    }
}
