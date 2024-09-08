package home_work_5;

import home_work_5.comparators.AgeAndNickAnimalsComparator;
import home_work_5.comparators.PasswordAndNickPersonComparator;
import home_work_5.randomaizers.Randomizers;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {

        int numberOfEntries = 100_000;


        List<Person> persons = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        generateRandomPerson(persons, numberOfEntries);
        generateRandomAnimal(animals, numberOfEntries);

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

    }

    private static void generateRandomAnimal(List<Animal> animals, int numberOfEntries) {
        for (int i = 0; i < numberOfEntries; i++) {
            int age = ThreadLocalRandom.current().nextInt(1, 16);
            String nickname = Randomizers.generateRandomNickAnimals();
            animals.add(new Animal(age, nickname));
        }
    }

    private static void generateRandomPerson(List<Person> persons, int numberOfEntries) {
        for (int i = 0; i < numberOfEntries; i++) {
            String name = Randomizers.generateRandomNamesHumans();
            String passwords = Randomizers.generatePassword();
            String nickname = Randomizers.generateRandomString();
            persons.add(new Person(name, passwords, nickname));
        }
    }







}


