package m.records;

import java.util.Objects;

public class BeforeRecords {

    public static void main(String[] args) {
        Person person = new Person(1, "Bart", "Simpson");
        System.out.println(person);
        System.out.println(person.getId());
    }

    static class Person {
        private int id;
        private String firstName;
        private String lastName;

        public Person(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person person = (Person) o;
            return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + Objects.hashCode(firstName);
            result = 31 * result + Objects.hashCode(lastName);
            return result;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

}
