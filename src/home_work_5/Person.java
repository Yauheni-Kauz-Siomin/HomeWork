package home_work_5;

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
}
