package home_work_5.DTO;

import java.util.Objects;

public class Animal {
    private int age;
    private String nickName;


    public Animal(int age, String nick) {
        this.age = age;
        this.nickName = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nickName, animal.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nickName);
    }
}


