package oop.task_0;

/**
 * Created by Vadim on 15.01.2016.
 */
public enum ListPeople {Petrov("Petrov", "Ivan", "Ivanovich","ul. Tankistov 5, 34"), Ivanov("Ivanov", "Semen", "Abramovich", "ul. Tankistov 5, 45"),
    Black("Black", "Dmitriy", "Vlodimirovich", "ul. Tankistov 5, 3"), Frolov("Frolov", "Gnat", "Ivanovich", "ul. Tankistov 5, 10"),
    Nemirof("Nemirof", "Stanislav", "Egorovich", "ul. Tankistov 5, 13"), Pechkin("Pechkin", "Vladislav", "Nikitovich", "ul. Tankistov 5, 32");
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;

    ListPeople(String lastName, String firstName, String middleName, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
    }

    ListPeople(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return  "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'';
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }
}
