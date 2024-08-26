package home_work_4;

import java.util.Arrays;

public class DataContainer<T> {

    private T[] data;


    public DataContainer(T[] data) {
        this.data = data;
    }



    public int add(T item) {
        int index = -1;

        if (item != null) {

            boolean pastNumber = false;

            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    index = i;
                    pastNumber = true;
                    break;
                }
            }
            if (!pastNumber) {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
                index = data.length - 1;
            }
        }

        return index;

    }

    @Override
    public String toString() {
        return "data = " + Arrays.toString(data);
    }
}