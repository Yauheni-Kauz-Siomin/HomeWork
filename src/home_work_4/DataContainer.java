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


    public T get(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        }
        return null;

    }

    public T[] getItems() {
        return data;
    }


    public boolean deleteIndex(int index) {
        if (index >= 0 && index < data.length) {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        return false;
    }


    public boolean deleteItem(T item) {
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
                if (item.equals(data[i])) {
                    return deleteIndex(i);
                }
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "data = " + Arrays.toString(data);
    }


}