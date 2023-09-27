package JavaPatterns_1_1_Creational;

public class Main {

    public static void main(String[] args) throws PersonBuilder {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(20)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setSurname("Вольф")
                .setAge(3)
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
    }
}

