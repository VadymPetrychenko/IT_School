package oop.task_0;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * 11. Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год начала эксплуатации, Пробег.
 * Создать массив объектов. Вывести:
 * a) список автобусов для заданного номера маршрута;
 * b) список автобусов, которые эксплуатируются больше заданного срока;
 * c) список автобусов, пробег у которых больше заданного расстояния.
 */
public class Bus {
    private String leastName;
    private String numberBus;
    private int numberRout;
    private String mark;
    private int yearExpluatation;
    private int mileage;

    public String getLeastName() {
        return leastName;
    }

    public String getNumberBus() {
        return numberBus;
    }

    public int getNumberRout() {
        return numberRout;
    }

    public String getMark() {
        return mark;
    }

    public int getYearExpluatation() {
        return yearExpluatation;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "leastName='" + leastName + '\'' +
                ", numberBus='" + numberBus + '\'' +
                ", numberRout=" + numberRout +
                ", mark='" + mark + '\'' +
                ", yearExpluatation=" + yearExpluatation +
                ", mileage=" + mileage + " км" +
                '}';
    }

    public Bus(String leastName, String numberBus, int numberRout, String mark, int yearExpluatation, int mileage) {
        this.leastName = leastName;
        this.numberBus = numberBus;
        this.numberRout = numberRout;
        this.mark = mark;
        this.yearExpluatation = yearExpluatation;
        this.mileage = mileage;
    }

    public static void main(String[] args) {
        Bus[] buses = new Bus[5];
        buses[0] = new Bus("Иванов А.А", "АХ6526", 272, "Газель", 2010, 123058);
        buses[1] = new Bus("Иванов А.А", "АХ6526", 263, "Газель", 2012, 80453);
        buses[2] = new Bus("Иванов А.А", "АХ6526", 211, "Газель", 2008, 136400);
        buses[3] = new Bus("Иванов А.А", "АХ6526", 272, "Газель", 2008, 162500);
        buses[4] = new Bus("Иванов А.А", "АХ6526", 272, "Газель", 2013, 64230);

        System.out.println("список автобусов маршрута 272");
        for (Bus b: buses){
            if (b.getNumberRout()==272) System.out.println(b);
        }
        System.out.println();
        System.out.println("список автобусов, которые эксплуатируются больше 5 лет");
        Calendar cl = new GregorianCalendar(TimeZone.getDefault());
        for (Bus b: buses){
            if ((cl.get(Calendar.YEAR) - b.getYearExpluatation()) < 5) System.out.println(b);
        }
        System.out.println();
        System.out.println("список автобусов, пробег у которых больше 120000.");
        for (Bus b: buses){
            if (b.getMileage() > 120000) System.out.println(b);
        }
    }
}
