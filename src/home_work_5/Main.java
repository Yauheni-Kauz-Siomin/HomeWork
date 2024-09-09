package home_work_5;

import home_work_5.DTO.Animal;
import home_work_5.DTO.Person;
import home_work_5.comparators.AgeAndNickAnimalsComparator;
import home_work_5.comparators.AgeAnimalsComparator;
import home_work_5.comparators.PasswordAndNickPersonComparator;
import home_work_5.comparators.PasswordLenghtPersonComparator;
import home_work_5.randomaizers.Randomizers;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {


        List<Person> persons = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        LinkedList<Person> linkedListPersons = new LinkedList<>(persons);
        ArrayList<Person> arrayListPersons = new ArrayList<>(persons);
        HashSet<Person> hashSetPersons = new HashSet<>(persons);
        TreeSet<Person> treeSetPersons = new TreeSet<>(new PasswordAndNickPersonComparator());
        treeSetPersons.addAll(persons);

        LinkedList<Animal> linkedListAnimals = new LinkedList<>(animals);
        ArrayList<Animal> arrayListAnimals = new ArrayList<>(animals);
        HashSet<Animal> hashSetAnimals = new HashSet<>(animals);
        TreeSet<Animal> treeSetAnimals = new TreeSet<>(new AgeAndNickAnimalsComparator());
        treeSetAnimals.addAll(animals);


        timeMeter(
                linkedListPersons, arrayListPersons, hashSetPersons, treeSetPersons,
                linkedListAnimals, arrayListAnimals, hashSetAnimals, treeSetAnimals);

        sortMethod(
                linkedListPersons, arrayListPersons, hashSetPersons, treeSetPersons,
                linkedListAnimals, arrayListAnimals, hashSetAnimals, treeSetAnimals);

    }


    private static void generateRandomAnimalList(List<Animal> animals) {
        int numberOfEntries = 300_000;
        for (int i = 0; i < numberOfEntries; i++) {
            int age = ThreadLocalRandom.current().nextInt(1, 16);
            String nickname = Randomizers.generateRandomNickAnimals();
            animals.add(new Animal(age, nickname));
        }
    }

    private static void generateRandomAnimalSet(Set<Animal> animals) {
        int numberOfEntries = 300_000;
        for (int i = 0; i < numberOfEntries; i++) {
            int age = ThreadLocalRandom.current().nextInt(1, 16);
            String nickname = Randomizers.generateRandomNickAnimals();
            animals.add(new Animal(age, nickname));
        }
    }

    private static void generateRandomPersonList(List<Person> persons) {
        int numberOfEntries = 300_000;
        for (int i = 0; i < numberOfEntries; i++) {
            String name = Randomizers.generateRandomNamesHumans();
            String passwords = Randomizers.generatePassword();
            String nickname = Randomizers.generateRandomString();
            persons.add(new Person(name, passwords, nickname));
        }
    }

    private static void generateRandomPersonSet(Set<Person> persons) {
        int numberOfEntries = 300_000;
        for (int i = 0; i < numberOfEntries; i++) {
            String name = Randomizers.generateRandomNamesHumans();
            String passwords = Randomizers.generatePassword();
            String nickname = Randomizers.generateRandomString();
            persons.add(new Person(name, passwords, nickname));
        }
    }


    private static void timeMeter(
            List<Person> linkedListPersons, List<Person> arrayListPersons,
            Set<Person> hashSetPersons, Set<Person> treeSetPersons,
            List<Animal> linkedListAnimals, List<Animal> arrayListAnimals,
            Set<Animal> hashSetAnimals, Set<Animal> treeSetAnimal) {

        long startTime = System.currentTimeMillis();
        generateRandomPersonList(new LinkedList<>(linkedListPersons));
        System.out.println("Заполнение LinkedList<Person> составило: " + (System.currentTimeMillis() - startTime) + " мс");
        startTime = System.currentTimeMillis();
        generateRandomPersonList(new ArrayList<>(arrayListPersons));
        System.out.println("Заполнение ArrayList<Person> составило: " + (System.currentTimeMillis() - startTime) + " мс");
        startTime = System.currentTimeMillis();
        generateRandomPersonSet(new HashSet<>(hashSetPersons));
        System.out.println("Заполнение HashSet<Person> составило: " + (System.currentTimeMillis() - startTime) + " мс");
        startTime = System.currentTimeMillis();
        generateRandomAnimalList(new LinkedList<>(linkedListAnimals));
        System.out.println("Заполнение LinkedList<Animal> составило: " + (System.currentTimeMillis() - startTime) + " мс");
        startTime = System.currentTimeMillis();
        generateRandomAnimalList(new ArrayList<>(arrayListAnimals));
        System.out.println("Заполнение ArrayList<Animal> составило: " + (System.currentTimeMillis() - startTime) + " мс");
        startTime = System.currentTimeMillis();
        generateRandomAnimalSet(new HashSet<>(hashSetAnimals));
        System.out.println("Заполнение HashSet<Animal> составило: " + (System.currentTimeMillis() - startTime) + " мс");

    }

    private static void sortMethod(List<Person> linkedListPersons, List<Person> arrayListPersons,
                                   Set<Person> hashSetPersons, Set<Person> treeSetPersons,
                                   List<Animal> linkedListAnimals, List<Animal> arrayListAnimals,
                                   Set<Animal> hashSetAnimals, Set<Animal> treeSetAnimal) {
        long startTime = System.currentTimeMillis();
        Collections.sort(arrayListPersons, new PasswordLenghtPersonComparator());
        System.out.println("Сортировка ArrayList<Person> по длине пароля составила: " + (System.currentTimeMillis() - startTime) + " мс");
        startTime = System.currentTimeMillis();
        Collections.sort(linkedListPersons, new PasswordLenghtPersonComparator());
        System.out.println("Сортировка linkedList<Person> по длине пароля составила: " + (System.currentTimeMillis() - startTime) + " мс");
        startTime = System.currentTimeMillis();
        Collections.sort(arrayListAnimals, new AgeAnimalsComparator());
        System.out.println("Сортировка ArrayList<Animal> по возрасту составила: " + (System.currentTimeMillis() - startTime) + " мс");
        startTime = System.currentTimeMillis();
        Collections.sort(linkedListAnimals, new AgeAnimalsComparator());
        System.out.println("Сортировка linkedList<Animal> по длине пароля составила: " + (System.currentTimeMillis() - startTime) + " мс");
    }





}


