package oop.task_0;


public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private long numberCreditCard;
    private int numberBankAccount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(long numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public int getNumberBankAccount() {
        return numberBankAccount;
    }

    public void setNumberBankAccount(int numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
    }

    public Customer(int id, String lastName, String firstName, String middleName, String address, long numberCreditCard, int numberBankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.numberCreditCard = numberCreditCard;
        this.numberBankAccount = numberBankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", numberCreditCard=" + numberCreditCard +
                ", numberBankAccount=" + numberBankAccount +
                '}';
    }

    public static void main(String[] args) {
        Customer[] customer = new Customer[6];
        customer[0] = new Customer(1654, "Petrov", "Ivan", "Ivanovich", "ul. Tankistov 5, 34", 1655_4987_8461_6245L, 54641);
        customer[1] = new Customer(9461, "Ivanov", "Semen", "Abramovich", "ul. Tankistov 5, 45", 9846_3149_4852_1674L, 64133);
        customer[2] = new Customer(4644, "Black", "Dmitriy", "Vlodimirovich", "ul. Tankistov 5, 3", 4567_0320_1694_1650L, 16493);
        customer[3] = new Customer(2030, "Frolov", "Gnat", "Ivanovich", "ul. Tankistov 5, 10", 1469_4507_5572_3627L, 49730);
        customer[4] = new Customer(7659, "Nemirof", "Stanislav", "Egorovich", "ul. Tankistov 5, 13", 3426_7617_6582_8725L, 19487);
        customer[5] = new Customer(3083, "Pechkin", "Vladislav", "Nikitovich", "ul. Tankistov 5, 32", 4288_6967_4622_7872L, 45678);

        for (int i = 0; i < customer.length; i++) {
            for (int j = 0; j < customer.length - 1; j++) {
                if (customer[j].getLastName().compareTo(customer[j+1].getLastName()) > 0){
                    Customer tmp = customer[j];
                    customer[j] = customer[j+1];
                    customer[j+1] = tmp;
                }
            }
        }

        for (Customer c : customer) {
            System.out.println(c);
        }
        System.out.println();

        System.out.println("Список покупателей, у которых номер кредитной карточки находится в интервале 3505_1616_1314_6112 - 5421_6348_2494_7521: ");
        for (Customer c: customer){
            if (c.getNumberCreditCard() > 3505_1616_1314_6112L & c.getNumberCreditCard() < 5421_6348_2494_7521L){
                System.out.println(c);
            }
        }
    }
}
