package oop.task_0;

import java.util.regex.Pattern;

public class AirLine {
    private String destination;
    private int numberFlight;
    private String typePlane;
    private String departureTime;
    private String weekDays;

    public String getDestination() {
        return destination;
    }

    public int getNumberFlight() {
        return numberFlight;
    }

    public String getTypePlane() {
        return typePlane;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "destination='" + destination + '\'' +
                ", numberFlight=" + numberFlight +
                ", typePlane='" + typePlane + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", weekDays='" + weekDays + '\'' +
                '}';
    }

    public String getWeekDays() {
        return weekDays;
    }

    public AirLine(String destination, int numberFlight, String typePlane, String departureTime, String weekDays) {
        this.destination = destination;
        this.numberFlight = numberFlight;
        this.typePlane = typePlane;
        this.departureTime = departureTime;
        this.weekDays = weekDays;
    }

    public static void main(String[] args) {
        AirLine[] airLines = new AirLine[5];
        airLines[0] = new AirLine("Париж", 4693, "Боинг", "20:00", "понедельник");
        airLines[1] = new AirLine("Прага", 6191, "Боинг", "07:00", "понедельник");
        airLines[2] = new AirLine("Люксембург", 1593, "Боинг", "22:30", "Среда");
        airLines[3] = new AirLine("Прага", 6893, "Боинг", "8:00", "Четверг");
        airLines[4] = new AirLine("Прага", 6201, "Боинг", "23:00", "Суббота");

        System.out.println("список рейсов до Праги");
        for (AirLine a: airLines){
            if (a.getDestination().equalsIgnoreCase("прага")) System.out.println(a);
        }
        System.out.println();
        System.out.println("список рейсов c вылетом в понедельник");
        for (AirLine a: airLines){
            if (a.getWeekDays().equalsIgnoreCase("понедельник")) System.out.println(a);
        }
        System.out.println();
        System.out.println("список рейсов c вылетом в понедельник и время вылета после 12:00");
        for (AirLine a: airLines){
            String[] tmp = a.getDepartureTime().split(Pattern.quote(":"));
            if (a.getWeekDays().equalsIgnoreCase("понедельник") & Integer.parseInt(tmp[0])>12) System.out.println(a);
        }
    }
}
