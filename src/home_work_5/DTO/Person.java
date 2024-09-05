package home_work_5.DTO;

import java.util.Objects;

public class Person {
    private String name;
    private String password;
    private String nickname;

    public Person(String name, String password, String nickname) {
        this.name = name;
        this.password = password;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setPassword(String password) {
        if (password.length()>= 5 && password.length()<= 10){
            this.password=password;
        }else {
            throw new IllegalArgumentException("Пароль должен содержать от 5 до 10 символов!");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(password, person.password) && Objects.equals(nickname, person.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, nickname);
    }

}
