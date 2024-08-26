package home_work_4;

public class DataContainerMain {
    public static void main(String[] args) {

        DataContainer<Integer> cont1 = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        int index1 = cont1.add(777);
        System.out.println(cont1);
        System.out.println("Индекс числа: " + index1);

        System.out.println("______________________________________________________________");

        DataContainer<Integer> cont2 = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        int index2 = cont2.add(null);
        System.out.println(cont2);
        System.out.println("Индекс числа: " + index2);

        System.out.println("______________________________________________________________");

        DataContainer<Integer> cont3 = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        int index3 = cont3.add(777);
        System.out.println(cont3);
        System.out.println("Индекс числа: " + index3);

        System.out.println("______________________________________________________________");

        DataContainer<Integer> cont4 = new DataContainer<>(new Integer[]{1, 2, 3});
        int index4 = cont4.add(777);
        System.out.println(cont4);
        System.out.println("Индекс числа: " + index4);


        System.out.println("______________________________________________________________");

        DataContainer<Integer> cont5 = new DataContainer<>(new Integer[]{});
        int index5 = cont5.add(777);
        System.out.println(cont5);
        System.out.println("Индекс числа: " + index5);

        System.out.println("______________________________________________________________");


        DataContainer<Integer> cont6 = new DataContainer<>(new Integer[]{});
        int index6 = cont6.add(9999);
        System.out.println(cont6);
        System.out.println("Индекс числа: " + index6);
        int index7 = cont6.get(0);
        System.out.println("Под индексом " + +index6 + " число " + index7);

        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont7 = new DataContainer<>(new Integer[]{9999});
        System.out.println(cont7);
        System.out.println(cont7.get(1));

        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont8 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result = cont8.delete(3);
        System.out.println(cont8);
        System.out.println(result);

        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont9 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result1 = cont9.delete(9);
        System.out.println(cont9);
        System.out.println(result1);


        System.out.println("______________________________________________________________");
        DataContainer<Integer> cont10 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean result2 = cont10.delete(2);
        System.out.println(cont10);
        System.out.println(result2);


    }
}
