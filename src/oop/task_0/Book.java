package oop.task_0;


public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearPublishing;
    private int pages;
    private double price;
    private String bookCover;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", pages=" + pages +
                ", price=" + price +
                ", bookCover='" + bookCover + '\'' +
                '}';
    }

    public Book(int id, String title, String author, String publishingHouse, int yearPublishing, int pages, double price, String bookCover) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearPublishing = yearPublishing;
        this.pages = pages;
        this.price = price;
        this.bookCover = bookCover;
    }

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(14,"Остров соровищь", "Роберт Льюис Стивенсон", "Печать", 1955, 236, 5.25,"твердый");
        books[1] = new Book(13,"Бойцовский клуб", "Чак Паланник", "Фолио", 1961, 236, 5.25,"мягкий");
        books[2] = new Book(17,"Я легенда", "Ричард Мэтисон", "Фолио", 2001, 236, 5.25,"твердый");
        books[3] = new Book(19,"я робот", "Айзек Азимов", "печать", 1983, 236, 5.25,"твердый");
        books[4] = new Book(23,"Двухсотлетний человек", "Айзек Азимов", "фолио", 1964, 236, 5.25,"твердый");

        System.out.println("список книг Айзек Азимов:");
        for (Book b: books){
            if (b.author.equalsIgnoreCase("Айзек Азимов")) System.out.println(b);
        }
        System.out.println();
        System.out.println("список книг, выпущенных издательством Фолио:");
                for (Book b: books){
                    if (b.getPublishingHouse().equalsIgnoreCase("фолио")) System.out.println(b);
                }
        System.out.println();
        System.out.println("список книг, выпущенных после 1970 года");
        for (Book b: books){
            if (b.getYearPublishing()> 1970) System.out.println(b);
        }
    }
}
