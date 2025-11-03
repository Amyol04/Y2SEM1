/**
 * Write a description of class AddressBook here.
 *
 * @author Amy O'Leary, R00246749
 */

public class AddressBook {
    public final int DEFAULT_SIZE = 25;
    public final int NOT_FOUND = -1;
    private Person[] people;
    private int count;

    public AddressBook() {
        this.people = new Person[DEFAULT_SIZE];
        this.count = 0;
    }

    public AddressBook(int size) {
        if (size <= 0) {
            this.people = new Person[DEFAULT_SIZE];
        } else {
            this.people = new Person[size];
        }
        this.count = 0;
    }

    public void add(Person p) {
        if (count < people.length) {
            people[count] = p;
            count++;
        } else {
            enlarge();
            add(p); // Try adding again after enlarging the array
        }
    }

    private int findIndex(String name) {
        for (int i = 0; i < count; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    public Person search(String name) {
        int index = findIndex(name);
        if (index != NOT_FOUND) {
            return people[index];
        } else {
            return null;
        }
    }

    public boolean delete(String name) {
        int index = findIndex(name);
        if (index != NOT_FOUND) {
            people[index] = people[count - 1]; // Replace with last element
            people[count - 1] = null; // Remove reference to last element
            count--;
            return true;
        }
        return false;
    }

    private void enlarge() {
        int newLength = (int) (people.length * 1.5);
        Person[] newPeople = new Person[newLength];
        System.arraycopy(people, 0, newPeople, 0, people.length);
        people = newPeople;
    }
}


