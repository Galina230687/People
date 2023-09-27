package JavaPatterns_1_1_Creational;

public class Main {

    public static void main(String[] args) throws PersonBuilder {
        Person mom = new PersonBuilder()
                .setName("����")
                .setSurname("�����")
                .setAge(20)
                .setAddress("������")
                .build();
        Person son = mom.newChildBuilder()
                .setName("�������")
                .setSurname("�����")
                .setAge(3)
                .build();
        System.out.println("� " + mom + " ���� ���, " + son);
    }
}

