package basics;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by Vadim on 08.12.2015.
 */
public class Task_2_1 {
    public static void main(String[] args) {


        String[] array = {"7114", "52162", "1513", "789", "456", "1834", "616198", "11219"};

//        1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        ArraysMethods.getShortLongNumber(array);

//        2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        ArraysMethods.sortDecrease(array);

//        3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        ArraysMethods.getLengthLessMiddle(array);

//        4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
        ArraysMethods.getDublicateNumeral(array);

//        5. Найти количество чисел, содержащих только четные числа, а среди них количество чисел с равным числом четных и нечетных цифр.
        ArraysMethods.getEvenUnevenNumeralInNumber(array);

//        6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        ArraysMethods.getNumberWithSortNumerals(array);

//        7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
        ArraysMethods.getNumberDifferentNumerals(array);

//        8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
        ArraysMethods.viewMatrix();
    }
}
