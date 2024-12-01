package m.immutability;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Attempt1 {

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
        // canonical constructor
        Person {
            hobbies = Collections.unmodifiableSet(hobbies);
        }

        // overloaded constructor
        Person(String name) {
            this(name, Set.of());
        }
    }

}
