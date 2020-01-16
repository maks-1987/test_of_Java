package CollectionsExample.Comparator_01;

import java.util.Objects;

public class Person implements Comparable<Person> {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    /** Теперь и коллекции, в которых принята сортировка по умолчанию (TreeSet) будут сортировать именно как ниже */
    @Override // Теперь объекты Персон можно сравнивать, что необходимо для TreeSet и подобных коллекций
    public int compareTo(Person person) {
        if (this.id < person.getId()) {
            return 1;
        } else if (this.id > person.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
