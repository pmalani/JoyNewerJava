package m.immutability;

import java.util.HashSet;
import java.util.Set;

public class Setup {

    public static void main(String[] args) {
        Set<String> hobbies = new HashSet<>();
        hobbies.add("reading");
        hobbies.add("swimming");
        Person person = new Person("Homer", hobbies);
        System.out.println(person);

        hobbies.add("cycling");
        System.out.println(person);

        Set<String> homersHobbies = person.hobbies();
        homersHobbies.add("diving");
        System.out.println(person);
    }

    record Person(String name, Set<String> hobbies) {
    }

}
