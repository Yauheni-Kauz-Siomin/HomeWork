package home_work_4;

public class DataContainerMain {
    public static void main(String[] args) {

        // реализация пункта 4.1.1
        DataContainer<Integer> cont1 = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        int index1 = cont1.add(777);
        System.out.println(cont1);
        System.out.println("Индекс числа: " + index1);

        // реализация пункта 4.1.2
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont2 = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        int index2 = cont2.add(null);
        System.out.println(cont2);
        System.out.println("Индекс числа: " + index2);

        // реализация пункта 4.1.3
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont3 = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        int index3 = cont3.add(777);
        System.out.println(cont3);
        System.out.println("Индекс числа: " + index3);

        // реализация пункта 4.2.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont4 = new DataContainer<>(new Integer[]{1, 2, 3});
        int index4 = cont4.add(777);
        System.out.println(cont4);
        System.out.println("Индекс числа: " + index4);

        // реализация пункта 4.2.2
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont5 = new DataContainer<>(new Integer[]{});
        int index5 = cont5.add(777);
        System.out.println(cont5);
        System.out.println("Индекс числа: " + index5);

        // реализация пункта 5.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont6 = new DataContainer<>(new Integer[]{});
        int index6 = cont6.add(9999);
        System.out.println(cont6);
        System.out.println("Индекс числа: " + index6);
        int index7 = cont6.get(0);
        System.out.println("Под индексом " + +index6 + " число " + index7);

        // реализация пункта 5.2
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont7 = new DataContainer<>(new Integer[]{9999});
        System.out.println(cont7);
        System.out.println(cont7.get(1));

        // реализация пункта 7.1.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont8 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result = cont8.deleteIndex(3);
        System.out.println(cont8);
        System.out.println(result);

        // реализация пункта 7.2.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont9 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result1 = cont9.deleteIndex(9);
        System.out.println(cont9);
        System.out.println(result1);

        // реализация пункта 7.3.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont10 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result2 = cont10.deleteIndex(2);
        System.out.println(cont10);
        System.out.println(result2);

        // реализация пункта 8.1.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont11 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result3 = cont11.deleteItem(null);
        System.out.println(cont11);
        System.out.println(result3);

        // реализация пункта 8.1.2
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont12 = new DataContainer<>(new Integer[]{1, 2, 3, 777, null});
        boolean result4 = cont12.deleteItem(null);
        System.out.println(cont12);
        System.out.println(result4);

        // реализация пункта 8.2.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont13 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result5 = cont13.deleteItem(777);
        System.out.println(cont13);
        System.out.println(result5);

        // реализация пункта 8.3.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont14 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result6 = cont14.deleteItem(111);
        System.out.println(cont14);
        System.out.println(result6);

        // реализация пункта 8.4.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont15 = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        boolean result7 = cont15.deleteItem(3);
        System.out.println(cont15);
        System.out.println(result7);

        // реализация пункта 9.1
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont16 = new DataContainer<>(new Integer[]{3, 1, 3, 777});
        System.out.println(cont16);
        cont16.sort(new IntegerComparator());
        System.out.println(cont16);

        // реализация пункта 9.2
        System.out.println("______________________________________________________________");
        DataContainer<String> cont17 = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка"});
        System.out.println(cont17);
        cont17.sort(new StringLengthComparator());
        System.out.println(cont17);

        // реализация пунктов 10.1-10.3
        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont18 = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        System.out.println(cont18);
        DataContainer<Integer> cont19 = new DataContainer<>(new Integer[]{1, 2, 3, null});
        System.out.println(cont19);
        DataContainer<Integer> cont20 = new DataContainer<>(new Integer[]{});
        System.out.println(cont20);


    }
}
