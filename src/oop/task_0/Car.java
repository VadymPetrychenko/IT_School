package oop.task_0;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * 8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 Создать массив объектов. Вывести:
 a) список автомобилей заданной марки;
 b) список автомобилей заданной модели, которые эксплуатируются боль-ше n лет;
 c) список автомобилей заданного года выпуска, цена которых больше ука-занной.

 */
public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private double price;
    private int registNumber;

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registNumber=" + registNumber +
                '}';
    }

    public Car(int id, String mark, String model, int year, String color, double price, int registNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registNumber = registNumber;
    }

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(41,"Volvo", "E150", 1985, "black", 5000, 651981651);
        cars[1] = new Car(41,"Mercedes", "E220", 1988, "black", 4000, 651981651);
        cars[2] = new Car(41,"VW", "Passat", 1992, "black", 6000, 651981651);
        cars[3] = new Car(41,"Mercedes", "S600", 1985, "black", 3250, 651981651);
        cars[4] = new Car(41,"Volvo", "E150", 1991, "black", 2000, 651981651);

        System.out.println("список автомобилей марки Mercedes");
        for (Car c: cars){
            if (c.getMark().equalsIgnoreCase("mercedes")) System.out.println(c);
        }
        System.out.println();

        Calendar cl = new GregorianCalendar(TimeZone.getDefault());
        System.out.println("список автомобилей заданной модели E150, которые эксплуатируются боль-ше 25 лет");
        for (Car c: cars){
            if (c.getModel().equalsIgnoreCase("E150") & cl.get(Calendar.YEAR)-c.getYear()>25) System.out.println(c);
        }
        System.out.println();
        System.out.println("список автомобилей 1985 года выпуска, цена которых больше 3500");
        for (Car c: cars){
            if (c.getYear()==1985 & c.getPrice()>3500) System.out.println(c);
        }
    }
}
