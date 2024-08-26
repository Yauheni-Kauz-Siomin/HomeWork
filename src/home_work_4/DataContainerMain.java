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




    }
}
