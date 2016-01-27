package oop.task_0;

import java.util.regex.Pattern;

public class Train {
    private String destination;
    private int namberTrain;
    private String departureTime;
    private int coupe;
    private int reservedSeat;
    private int delux;
    private int commonPlaces;

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCommonPlaces() {
        return commonPlaces;
    }

    public Train(String destination, int namberTrain, String departureTime, int coupe, int reservedSeat, int delux, int commonPlaces) {
        this.destination = destination;
        this.namberTrain = namberTrain;
        this.departureTime = departureTime;
        this.coupe = coupe;
        this.reservedSeat = reservedSeat;
        this.delux = delux;
        this.commonPlaces = commonPlaces;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", namberTrain=" + namberTrain +
                ", departureTime='" + departureTime + '\'' +
                ", coupe=" + coupe +
                ", reservedSeat=" + reservedSeat +
                ", delux=" + delux +
                ", commonPlaces=" + commonPlaces +
                '}';
    }

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Киев", 3234, "16:55", 200, 100, 40, 0);
        trains[1] = new Train("Харьков", 8764, "17:05", 200, 100, 0, 0);
        trains[2] = new Train("Киев", 6308, "10:20", 100, 0, 0, 100);
        trains[3] = new Train("Львов", 7541, "22:35", 100, 0, 0, 150);
        trains[4] = new Train("Киев", 7004, "08:55", 200, 100, 40, 0);

        System.out.println("список поездов, следующих до Киева:");
        for (Train t : trains) {
            if (t.getDestination().equalsIgnoreCase("киев")) System.out.println(t);
        }
        System.out.println();
        System.out.println("список поездов, следующих до Киева и отправляющиеся после 9:00 часа");
        for (Train t : trains) {
            String[] tmp = t.getDepartureTime().split(Pattern.quote(":"));
            if (t.getDestination().equalsIgnoreCase("киев") & Integer.parseInt(tmp[0]) > 9) System.out.println(t);
        }
        System.out.println();
        System.out.println("список поездов, отправляющихся до Киева и имеющих общие места");
        for (Train t : trains) {
            if (t.getDestination().equalsIgnoreCase("киев") & t.getCommonPlaces() > 0) System.out.println(t);
        }
    }
}
