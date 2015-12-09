package basics;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Scanner;


public class Task_1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

//        1. Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println("Введите свое имя: ");
        String name = scan.next();
        System.out.println("Hello " + name);

//        2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        System.out.print("Отоброжение аргументов в обратном порядке: ");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
        System.out.println();

//         3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        System.out.println("Отображение чисел с переходом и без перехода на новую строку: ");
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) System.out.println(args[i]);
            else System.out.print(args[i] + " ");
        }

//        4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        System.out.println("Введите пароль (образец - pass666word): ");
        String pass = scan.next();
//        System.out.println("Сравнение с образцом: " + pass.equals("pass666word"));
        if(pass.equals("pass666word")) System.out.println("Пароль введен правильно!");
        else System.out.println("Вы ввели неправильно пароль");

//        5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        long mult = 1;
        for (String x : args) {
            int n = Integer.parseInt(x);
            mult *= n;
        }
        System.out.println("Произведение аргументов: " + mult);


//        6.Ввести с консоли n целых чисел. На консоль вывести:


        System.out.println("Введите 6 чисел:");
        int[] arrayInt = new int[6];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(scan.next());
        }

//        6.1. Четные и нечетные числа.
        System.out.print("Четные числа: ");
        for (int x : arrayInt) {
            if (x % 2 == 0) System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Нечетные числа: ");
        for (int x : arrayInt) {
            if (x % 2 != 0) System.out.print(x + " ");
        }
        System.out.println();

//        6.2. Наибольшее и наименьшее число.
        int max = 0, min = arrayInt[0];
        for (int x : arrayInt) {
            if (max < x) max = x;
        }
        System.out.println("Наибольшее число: " + max);
        for (int x : arrayInt) {
            if (min > x) min = x;
        }
        System.out.println("Наименьшее число: " + min);


//        6.3. Числа, которые делятся на 3 или на 9.
        System.out.print("Числа которые делятся на 3: ");
        for (int x : arrayInt) {
            if (x % 3 == 0) System.out.print(x + " ");
        }
        System.out.println();

//        6.4. Числа, которые делятся на 5 и на 7.
        System.out.print("Числа которые делятся на 5: ");
        for (int x : arrayInt) {
            if (x % 5 == 0) System.out.print(x + " ");
        }
        System.out.println();

//        6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        for (int x : arrayInt) {
            int count = 0, copyX = x;
            while (copyX != 0) {    //Считаем кол-во цифр в числе
                copyX /= 10;
                count++;
            }
            if (count == 3) {
                int s = 0, copyX2 = x;
                int[] nums = {0, 0, 0};
                for (int i = 0; i < 3; i++) {
                    nums[i] = copyX2 % 10;
                    copyX2 /= 10;
                }
                if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2])
                    System.out.println("Трех значное число в котором нет одинаковых цифр: " + x);
            }
        }

//        6.6. «Счастливые» числа.
        for (int x : arrayInt) {        //Считаем количество цифр в числе
            int count = 0, copyX = x;
            while (copyX != 0) {
                copyX /= 10;
                count++;
            }
            if (count % 2 == 0 && count != 2) {     // Выбираем числа имеющие четное кол-во цифр и больше 2
                int copyX2 = x, sum1 = 0, sum2 = 0;
                for (int i = 0; i < count / 2; i++) {
                    sum1 += copyX2 % 10;
                    copyX2 /= 10;
                }
                for (int i = count / 2; i < count; i++) {
                    sum2 += copyX2 % 10;
                    copyX2 /= 10;
                }
                if (sum1 == sum2) System.out.println("Число: " + x + " - Счастливое!");
            }
        }


//        6.7. Элементы, которые равны полусумме соседних элементов.
        for (int i = 1; i < arrayInt.length - 1; i++) {
            if ((arrayInt[i - 1] + arrayInt[i + 1]) / 2 == arrayInt[i]) {
                System.out.println("Элемент равеный полусумме соседних элементов: " + arrayInt[i]);
            }
        }
    }
}

