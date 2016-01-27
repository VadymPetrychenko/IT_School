package oop.task_0;

import java.util.Arrays;


public class Phone {
    private int id;
    ListPeople lp;
    private long numberCreditCard;
    private int debit;
    private int credit;
    private int timeCityTalk;
    private int timeOutCityTald;

    public int getTimeCityTalk() {
        return timeCityTalk;
    }

    public int getTimeOutCityTald() {
        return timeOutCityTald;
    }

    public ListPeople getLp() {
        return lp;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id + ", " + lp +
                ", numberCreditCard=" + numberCreditCard +
                ", debit=" + debit +
                ", credit=" + credit +
                ", timeCityTalk=" + timeCityTalk +
                ", timeOutCityTald=" + timeOutCityTald +
                '}';
    }

    public Phone(int id, ListPeople lp, long numberCreditCard, int debit, int credit, int timeCityTalk, int timeOutCityTald) {
        this.id = id;
        this.lp = lp;
        this.numberCreditCard = numberCreditCard;
        this.debit = debit;
        this.credit = credit;
        this.timeCityTalk = timeCityTalk;
        this.timeOutCityTald = timeOutCityTald;
    }

    public static void main(String[] args) {
        Phone[] phones = new Phone[5];
        phones[0] = new Phone(16, ListPeople.Petrov, 4655_1656_1619_1896l, 23, 99, 30, 19);
        phones[1] = new Phone(14, ListPeople.Ivanov, 2786_1656_1619_1896l, 102, 10, 21, 0);
        phones[2] = new Phone(13, ListPeople.Nemirof, 2866_1656_1619_1896l, 75, 14, 85, 11);
        phones[3] = new Phone(33, ListPeople.Petrov, 2782_1656_1619_1896l, 79, 91, 36, 21);
        phones[4] = new Phone(53, ListPeople.Frolov, 8678_1656_1619_1896l, 134, 67, 78, 0);

        System.out.println("Абоненты, у которых время внутригородских разговоров превышает 30 минут;");
        for (Phone p : phones) {
            if (p.getTimeCityTalk() > 30) System.out.println(p);
        }
        System.out.println();
        System.out.println("Абоненты, которые пользовались междугородной связью");
        for (Phone p : phones) {
            if (p.getTimeOutCityTald() > 0) System.out.println(p);
        }
        System.out.println();
        System.out.println("Сведения об абонентах в алфавитном порядке:");
        for (int i = 0; i < phones.length; i++) {
            for (int j = 0; j < phones.length-1; j++) {
                if (phones[j].lp.getLastName().compareTo(phones[j + 1].lp.getLastName()) > 0) {
                    Phone tmp = phones[j];
                    phones[j] = phones[j + 1];
                    phones[j + 1] = tmp;
                }
            }
        }
        for (Phone p : phones) {
            System.out.println(p);
        }

    }
}

