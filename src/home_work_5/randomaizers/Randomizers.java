package home_work_5.randomaizers;

import java.util.Random;


public class Randomizers {
    private static final String[] HUMAN_NAMES = {"Евгений", "Василий", "Анна", "Пётр", "Евлампий"};
    private static final String[] ANIMAL_NICKS = {"Рекс", "Жучка", "Бим", "Крабер"};

    private static final Random random = new Random();
    private static Object FileNotFoundException;

    public static String generatePassword() {

        StringBuilder password = new StringBuilder();
        int passwordLength = (random.nextInt(10));
        for (int i = 0; i < passwordLength; i++) {
            password.append((char) random.nextInt(9) + 16);
        }

        return password.toString();
    }

    public static String generateRandomString() {

        int stringLength = random.nextInt(10);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            sb.append((char) random.nextInt());
        }
        return sb.toString();
    }

    public static String generateRandomRussionString() {
        int stringLength = random.nextInt(10);
        StringBuilder sb = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            sb.append((char) random.nextInt(32) + 1072);
        }
        return sb.toString();
    }

    public static String generateRandomNamesHumans() {
        int index = random.nextInt(HUMAN_NAMES.length);
        return HUMAN_NAMES[index];
    }

    public static String generateRandomNickAnimals() {
        int index = random.nextInt(ANIMAL_NICKS.length);
        return HUMAN_NAMES[index];
    }

}
