package home_work_5.comparators;

import home_work_5.DTO.Animal;

import java.util.Comparator;

public class AgeAndNickAnimalsComparator implements Comparator <Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        int result = Integer.compare(o1.getAge(), o2.getAge());
        if (result == 0) {
            result = o1.getNick().compareTo(o2.getNick());
        }
        return result;
    }
}
