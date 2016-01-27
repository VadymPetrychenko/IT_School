package oop.task_0;


public class House {
    private int id;
    private int numberFlat;
    private double square;
    private int stage;
    private int rooms;
    private String street;
    private String typeBild;
    private int timeUsing;

    public int getRooms() {
        return rooms;
    }

    public int getStage() {
        return stage;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", numberFlat=" + numberFlat +
                ", square=" + square +
                ", stage=" + stage +
                ", rooms=" + rooms +
                ", street='" + street + '\'' +
                ", typeBild='" + typeBild + '\'' +
                ", timeUsing=" + timeUsing +
                '}';
    }

    public House(int id, int numberFlat, double square, int stage, int rooms, String street, String typeBild, int timeUsing) {
        this.id = id;
        this.numberFlat = numberFlat;
        this.square = square;
        this.stage = stage;
        this.rooms = rooms;
        this.street = street;
        this.typeBild = typeBild;
        this.timeUsing = timeUsing;
    }

    public static void main(String[] args) {
        House[] houses = new House[5];
        houses[0] = new House(46, 4, 62.3, 4, 4, "Светлая", "Жилой комплекс", 40);
        houses[1] = new House(46, 45, 50.1, 8, 2, "Светлая", "Жилой комплекс", 40);
        houses[2] = new House(46, 75, 41.7, 2, 1, "Светлая", "Жилой комплекс", 40);
        houses[3] = new House(46, 23, 58.4, 6, 2, "Светлая", "Жилой комплекс", 40);
        houses[4] = new House(46, 8, 59.7, 11, 3, "Светлая", "Жилой комплекс", 40);

        System.out.println("Список квартир, имеющих 2 комнаты: ");
        for (House h : houses) {
            if (h.getRooms() == 2) System.out.println(h);
        }
        System.out.println();
        System.out.println("Список квартир, имеющих 2 комнаты и расположенных на этаже, который находится между 5 и 10 этажом:");
        for (House h : houses) {
            if (h.getRooms() == 2 & h.getStage() > 5 & h.getStage() < 10) System.out.println(h);
        }
        System.out.println();
        System.out.println("Список квартир, имеющих площадь, превосходящую 55 м.кв:");
        for (House h : houses) {
            if (h.getSquare() > 55) System.out.println(h);
        }
    }
}
