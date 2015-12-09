package basics;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by Vadim on 08.12.2015.
 */
public class Task_2 {
    public static void main(String[] args) {
/*
        Ввести n чисел с консоли.



        4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
        5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
        6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
        8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
*/
//        1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        int max = 0, min = args[0].length();
        String sMax = null, sMin = null;
        for (String str : args) {
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


//        2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length - 1; j++) {
                if (args[j].length() < args[j + 1].length()) {
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
        System.out.print("Числа выведены в порядке убывания значений их длины: ");
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();

//        3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        System.out.print("Числа, длинна которых меньше средней:");
        int sum = 0, count = 0;
        for(String s: args){
            sum += s.length();
            count++;
        }
        for(String s: args){
            if(s.length() < (sum/count)) {
                System.out.print(" " + s + " длина - " + s.length() + ";");
            }
        }

    }
}
