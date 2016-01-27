package oop.task_0;

import java.util.regex.Pattern;


public class Product {
    private int id;
    private String title;
    private int upc;
    private String manufacturer;
    private double price;
    private String dateUsing;
    private int quantity;

    public double getPrice() {
        return price;
    }

    public String getDateUsing() {
        return dateUsing;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", upc=" + upc +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", dateUsing=" + dateUsing +
                ", quantity=" + quantity +
                '}';
    }

    public Product(int id, String title, int upc, String manufacturer, double price, String dateUsing, int quantity) {
        this.id = id;
        this.title = title;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.dateUsing = dateUsing;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(6, "Макароны", 131, "Чумак", 21.5, "6 month", 100);
        products[1] = new Product(6, "Гречневая крупа", 131, "Посад", 22.0, "6 month", 100);
        products[2] = new Product(6, "Макароны", 131, "Макфа", 24.2, "10 month", 100);
        products[3] = new Product(6, "Рисовая крупа", 131, "Чумак", 21.5, "4 month", 100);
        products[4] = new Product(6, "Макароны", 131, "Чумак", 20.5, "18 month", 100);
        System.out.println("список товаров \"макароны\"");
        for (Product p : products) {
            if (p.getTitle().equalsIgnoreCase("макароны")) System.out.println(p);
        }
        System.out.println();
        System.out.println("список товаров \"макароны\", цена которых не превосходит 21");
        for (Product p : products) {
            if (p.getPrice() < 21) System.out.println(p);
        }
        System.out.println();
        System.out.println("список товаров, срок хранения которых больше 6 месяцев");
        for (Product p : products) {
           String[] tmp =  p.getDateUsing().split(Pattern.quote(" "));
            if (Integer.parseInt(tmp[0]) > 6) System.out.println(p);
        }
    }
}
