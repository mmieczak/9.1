public class Person {
    private final String name;
    private final String lastName;
    private final String id;

    public Person(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
