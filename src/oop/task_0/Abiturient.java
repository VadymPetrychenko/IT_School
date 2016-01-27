package oop.task_0;

import java.util.Arrays;


public class Abiturient {
    private int id;
    ListPeople lp;
    private int phone;
    private int[] appraisal;

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", " + lp +
                ", phone=" + phone +
                ", appraisal=" + Arrays.toString(appraisal) +
                '}';
    }

    public Abiturient(int id, ListPeople lp, int phone, int[] appraisal) {
        this.id = id;
        this.lp = lp;
        this.phone = phone;
        this.appraisal = appraisal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListPeople getLp() {
        return lp;
    }

    public void setLp(ListPeople lp) {
        this.lp = lp;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int[] getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(int[] appraisal) {
        this.appraisal = appraisal;
    }

    public static void main(String[] args) {
        Abiturient[] abiturients = new Abiturient[6];
        abiturients[0] = new Abiturient(21, ListPeople.Black, 166499, new int[]{4, 5, 3, 3, 3, 5});
        abiturients[1] = new Abiturient(17, ListPeople.Pechkin, 425255, new int[]{3, 2, 3, 2, 3, 5});
        abiturients[2] = new Abiturient(34, ListPeople.Nemirof, 273837, new int[]{4, 5, 4, 4, 4, 5});
        abiturients[3] = new Abiturient(71, ListPeople.Petrov, 848667, new int[]{3, 5, 3, 3, 2, 5});
        abiturients[4] = new Abiturient(20, ListPeople.Ivanov, 867866, new int[]{5, 5, 5, 4, 3, 5});
        abiturients[5] = new Abiturient(37, ListPeople.Frolov, 643488, new int[]{4, 5, 5, 5, 4, 5});

        System.out.println("список абитуриентов, имеющих неудовлетворительные оценки: ");
        for (Abiturient a : abiturients) {
            int[] tmp = a.getAppraisal();
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] == 2) {
                    System.out.println(a);
                    break;
                }
            }
        }
        System.out.println();

        System.out.println("список абитуриентов, у которых сумма баллов выше 25");
        for (Abiturient a : abiturients) {
            int[] tmp = a.getAppraisal();
            int sum = 0;
            for (int i = 0; i < tmp.length; i++) {
                sum += tmp[i];
            }
            if (sum > 25) {
                System.out.println(a);
            }
        }
        System.out.println();

        System.out.println("4 абитуриента, имеющие самую высокую сумму баллов:");
        int[] sum = new int[abiturients.length];
        for (int j = 0; j < abiturients.length; j++) {
            int[] tmp = abiturients[j].getAppraisal();
            int tmpSum = 0;
            for (int i = 0; i < tmp.length; i++) {
                tmpSum += tmp[i];
            }
            sum[j] = tmpSum;
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length - 1; j++) {
                if (sum[j]< sum[j+1]){
                    Abiturient tmp = abiturients[j];
                    abiturients[j] = abiturients[j+1];
                    abiturients[j+1] = tmp;
                    int temp = sum[j];
                    sum[j] = sum[j+1];
                    sum[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(abiturients[i]);
        }

    }
}
