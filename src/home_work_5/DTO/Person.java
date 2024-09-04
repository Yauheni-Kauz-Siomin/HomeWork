package home_work_5.DTO;

import java.util.Objects;

public class Person {
    private String nick;
    private int password;
    private String name;

    public Person(String nick, int password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick() {

        return nick;
    }

    public int getPassword() {

        return password;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return password == person.password && Objects.equals(nick, person.nick) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }
}
