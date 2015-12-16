package basics;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Vadim on 12.12.2015.
 */
public class ArraysMethods {
    public static void getShortLongNumber(String[] array) {
        int max = 0, min = array[0].length();
        String sMax = null, sMin = null;
        for (String str : array) {
            if (str.length() > max) {
                max = str.length();
                sMax = str;
            }
            if (str.length() <= min) {
                min = str.length();
                sMin = str;
            }
        }
        System.out.println("Саммое длинное число: " + sMax + " его длинна:" + max);
        System.out.println("Саммое короткое число: " + sMin + " его длинна:" + min);
    }

    public static void sortDecrease(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].length() < array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Числа выведены в порядке убывания значений их длины: ");
        System.out.println(Arrays.toString(array));
    }

    public static void getLengthLessMiddle(String[] array) {
        System.out.print("Числа, длинна которых меньше средней:");
        int sum = 0, count = 0;
        for (String s : array) {
            sum += s.length();      //считаем сумму длин чисел
            count++;                //считаем кол-во чисел
        }
        for (String s : array) {
            if (s.length() < (sum / count)) { //Сравниваем длинну числа со средней длиной чисел
                System.out.print(" " + s + " длина - " + s.length() + ";");
            }
        }
        System.out.println();
    }

    public static void getDublicateNumeral(String[] array) {
        String number = "";
        int maxReps = 10;   //максимаотное количество различных цифр
        for (String s : array) {
            int count = 0;
            if (s.length() == 1) {
                number = s;
                break;
            } else {
                byte[] b = s.getBytes();    //переводим число в байтовый массив
                Arrays.sort(b);             //сортируем его
                for (int i = 0; i < b.length - 1; i++) {    //считаем кол-во не повторений цифр
                    if (b[i] == b[i + 1]) continue;
                    else count++;
                }
            }
            if (count < maxReps) {
                maxReps = count;
                number = s;
            }
        }
        System.out.println("Число, в котором число различных цифр минимально: " + number);
    }

    public static void getEvenUnevenNumeralInNumber(String[] array) {
        System.out.print("Четные числа содержащие одинаковое кол-во четных и нечетных цифр: ");
        for (String s : array) {
            int evenCount = 0, unevenCount = 0;
            if (Integer.parseInt(s) % 2 == 0) {
                for (int i = 0; i < s.length(); i++) {
                    int tmp = s.charAt(i) - '0';
                    if (tmp % 2 == 0) evenCount++;
                    else unevenCount++;
                }
                if (evenCount == unevenCount) System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    public static void getNumberWithSortNumerals(String[] array) {
        for (String s : array) {
            if (ArrayUtils.isSorted(s.getBytes()) == true) {
                System.out.println("Число в котором цифры идут в строгом порядке возрастания " + s);
                break;
            }
        }
    }

    public static void getNumberDifferentNumerals(String[] array) {
        for (String s : array) {
            int count = 0;
            byte[] tmp = s.getBytes();
            Arrays.sort(tmp);
            for (int i = 0; i < tmp.length - 1; i++) {
                if (tmp[i] == tmp[i + 1]) break;
                else count++;
            }
            if (count == s.length() - 1) {
                System.out.println("Число состоящее только из различных цифр " + s);
                break;
            }
        }
    }

    public static void viewMatrix() {
        int numb = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(numb + " ");
                numb++;
            }
            System.out.println();
        }
    }
}

