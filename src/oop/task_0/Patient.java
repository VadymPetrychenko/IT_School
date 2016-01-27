package oop.task_0;


public class Patient {
    private int id;
    ListPeople listPeople;
    private int phone;
    private int numberMadicalCard;
    private String diagnosis;

    public Patient(int id, ListPeople listPeople, int phone, int numberMadicalCard, String diagnosis) {
        this.id = id;
        this.listPeople = listPeople;
        this.phone = phone;
        this.numberMadicalCard = numberMadicalCard;
        this.diagnosis = diagnosis;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberMadicalCard() {
        return numberMadicalCard;
    }

    public void setNumberMadicalCard(int numberMadicalCard) {
        this.numberMadicalCard = numberMadicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", " + listPeople +
                ", phone=" + phone +
                ", numberMadicalCard=" + numberMadicalCard +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Patient[] patients = new Patient[6];
        patients[0] = new Patient(654, ListPeople.Petrov, 646494, 1649, "кашель");
        patients[1] = new Patient(591, ListPeople.Pechkin, 461649, 9461, "простуда");
        patients[2] = new Patient(164, ListPeople.Nemirof, 49816, 1493, "насморк");
        patients[3] = new Patient(465, ListPeople.Black, 614198, 4654, "простуда");
        patients[4] = new Patient(549, ListPeople.Frolov, 944646, 4320, "грипп");
        patients[5] = new Patient(413, ListPeople.Ivanov, 466533, 3148, "кашель");

        System.out.println("Список поциентов имеющих диагноз \"грип\": ");
        for (Patient p : patients) {
            if (p.getDiagnosis().equals("грипп")) {
                System.out.println(p);
            }
        }
        System.out.println();
        System.out.println("список пациентов, номер медицинской карты которых находится в интервале 2000 - 4500: ");
        for (Patient p : patients) {
            if (p.getNumberMadicalCard() > 2000 & p.getNumberMadicalCard() < 4500) {
                System.out.println(p);
            }
        }

    }
}
