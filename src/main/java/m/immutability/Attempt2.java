package m.immutability;

import java.util.HashSet;
import java.util.Set;

public class Attempt2 {

    public static void main(String[] args) {
        Set<String> hobbies = new HashSet<>();
        hobbies.add("reading");
        hobbies.add("swimming");
        Person person = new Person("Homer", hobbies);
        System.out.println(person);

        hobbies.add("cycling");
        System.out.println(person);

        Set<String> homerHobbies = person.hobbies();
        homerHobbies.add("diving");
        System.out.println(person);
    }

    record Person(String name, Set<String> hobbies) {
        Person {
            hobbies = Set.copyOf(hobbies);
        }
    }

}
