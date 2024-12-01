package m.records;

public class AfterRecords {

    public static void main(String[] args) {
        Person person = new Person(1, "Maggie", "Simpson");
        System.out.println(person);
        System.out.println(person.id());
    }

    record Person(int id, String firstName, String lastName) {
    }

}
