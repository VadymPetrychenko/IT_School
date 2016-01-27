package oop.task_0;

import java.util.regex.Pattern;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    public Student(String lastName, String firstName, String middleName, String birthDate, String address, int phoneNumber, String faculty, int course, String group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("Petrov", "Ivan", "Ivanovich", "10.08.1990", "ul. Tankistov 5, 34", 154987, "EOG", 2, "Sis2");
        students[1] = new Student("Ivanov", "Semen", "Abramovich", "20.02.1987", "ul. Tankistov 5, 45", 758964, "EOG", 3, "Sis1");
        students[2] = new Student("Black", "Dmitriy", "Vlodimirovich", "02.11.1980", "ul. Tankistov 5, 3", 442563, "MEO", 2, "GHT");
        students[3] = new Student("Frolov", "Gnat", "Ivanovich", "14.07.1982", "ul. Tankistov 5, 10", 725934, "EOG", 1, "Sis2");
        students[4] = new Student("Nemirof", "Stanislav", "Egorovich", "12.03.1982", "ul. Tankistov 5, 13", 134768, "GSH", 4, "GH3");
        students[5] = new Student("Pechkin", "Vladislav", "Nikitovich", "11.08.1984", "ul. Tankistov 5, 32", 697854, "EOG", 2, "Sis2");


        System.out.println("Выводит на экран студентов факультета EOG: ");
        for (Student s: students){
            if (s.getFaculty().equals("EOG")) System.out.println(s + " ");
        }
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getFaculty().compareTo(students[j + 1].getFaculty()) > 0 || students[j].getCourse() > students[j + 1].getCourse()) {
                    Student tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;

                }
            }
        }
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Студенты родившиеся после 1982 года: ");
        for (Student s: students){
            String[] temp=  s.getBirthDate().split(Pattern.quote("."));
            if (temp[temp.length-1].compareTo("1982") > 0) System.out.println(s);
        }



    }
}
