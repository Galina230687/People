package JavaPatterns_1_1_Creational;

public class PersonBuilder extends Throwable {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) throws IllegalStateException {
        if (name.isEmpty() || name == null) {
            throw new IllegalStateException("�� ������ ���");
        } else this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname.isEmpty() || surname == null) {
            throw new IllegalStateException("�� ������ �������");
        } else this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("������� ����� �������");
        } else {
            this.age = age;
        }
        return this;

    }

    public Person build() {
        Person person;
        if (name == null || surname == null) throw new IllegalStateException("�� ������ ��� ��� �������");
        if (age < 0) {
            person = new Person(name, surname, age);
        } else person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
}










