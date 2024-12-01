package m.records;

import lombok.Value;

public class WithLombok {

    public static void main(String[] args) {
        Person person = new Person(1, "Lisa", "Simpson");
        System.out.println(person);
        System.out.println(person.getId());
    }

    @Value
    public static class Person {
        int id;
        String firstName;
        String lastName;
    }

}
