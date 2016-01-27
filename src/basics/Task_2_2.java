package basics;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vadim on 16.12.2015.
 */
public class Task_2_2 {
    public static void main(String[] args) {
      /*  9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы
      в интервале значений от -n до n с помощью датчика случайных чисел.*/
//        System.out.println("Введите размерность метрицы: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[][] arrayInt = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arrayInt[i][j] = (int) Math.floor(Math.random() * (2 * n + 1) - n);
//            }
//        }
        int[][] arrayInt = new int[][]{{0, 0, 0, 0}, {0, 5, 1, 3}, {0, 9, 7, 6}, {0, 0, 0, 0}};


//        System.out.println(Arrays.deepToString(arrayInt));
        MatrixMethods.showMatrix(arrayInt);
        System.out.println();

//        9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
//        MatrixMethods.getSortColumnMatrix(arrayInt);
//        MatrixMethods.showMatrix(arrayInt);

//        9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
//        MatrixMethods.getShiftMatrixRight(arrayInt);
//        MatrixMethods.showMatrix(arrayInt);

//        9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
//        MatrixMethods.getSortNumbers(arrayInt);

//        9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
//        MatrixMethods.getSumBetweenPositivElement(arrayInt);

//        9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
//        MatrixMethods.rotationMatrix_90_degrees(arrayInt);
//        MatrixMethods.showMatrix(arrayInt);

//        9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
//        MatrixMethods.getMatrixMinusAverage(arrayInt);

//        9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
//        MatrixMethods.showMatrix(MatrixMethods.sealingMatrix(arrayInt));


//        9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
//        MatrixMethods.shiftZeroElements(arrayInt);
//        MatrixMethods.showMatrix(arrayInt);
    }
}
