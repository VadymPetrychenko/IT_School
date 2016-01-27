package basics;

import org.apache.commons.lang3.ArrayUtils;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Vadim on 16.12.2015.
 */
public class MatrixMethods {
    public static void showMatrix(int[][] array) { //метод отображения массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) System.out.print(array[i][j] + " ");
                else System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getSortColumnMatrix(int[][] array) {  //упорядочивает столбцы в порядке возростания
        for (int n = 0; n < array.length; n++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j][i] > array[j + 1][i]) {
                        int tmp = array[j][i];
                        array[j][i] = array[j + 1][i];
                        array[j + 1][i] = tmp;
                    }
                }
            }
        }
    }

    public static void getShiftMatrixRight(int[][] array) {
        System.out.println("Введите значение на которое нужно сдвинуть матрицу в право: ");
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.next());
        for (int a = 0; a < k; a++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    int x = array[i][j];
                    array[i][j] = array[i][j - 1];
                    array[i][j - 1] = x;
                }
            }
        }
    }

    public static void rotationMatrix_90_degrees(int[][] array) {
        int[][] arrayCopy = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                arrayCopy[i][j] = array[j][array.length - 1 - i];
            }
        }
        System.arraycopy(arrayCopy, 0, array, 0, arrayCopy.length);
    }

    public static void getSortNumbers(int[][] array) {
        int count = 0;
        String str = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                int countNew = 0;
                String s = "";
                if (array[i][j] + 1 == array[i][j + 1]) {
                    s = array[i][j] + " ";
                    for (int k = j; k < array[i].length - 1; k++) {
                        if (array[i][j] + 1 == array[i][j + 1]) {
                            countNew++;
                            j++;
                            s += array[i][j] + " ";
                        } else continue;
                    }
                    if (countNew > count) {
                        str = s;
                        count = countNew;
                    }
                }
            }
        }
        System.out.print(str);
    }

    public static void getSumBetweenPositivElement(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    do {
                        j++;
                        if (array[i][j] <= 0) {
                            sum += array[i][j];
                        } else break;
                    } while (j < array[i].length - 1);
                    break;
                }
            }
            System.out.println("Сумма элементов " + (i + 1) + " строки: " + sum);
        }
    }

    public static void getMatrixMinusAverage(int[][] array) {
        double[][] newArray = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            double average = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            average = (double) sum / array[i].length;
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[i][j] - average;
            }
        }
        System.out.println(Arrays.deepToString(newArray));
    }

    public static int[][] sealingMatrix(int[][] arrayInt) {
        int[][] tmp = new int[arrayInt.length][arrayInt.length];
        int indexTmp = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            int countRow = 0;
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (arrayInt[i][j] == 0) countRow++;
            }
            if (countRow != arrayInt[i].length) {
                System.arraycopy(arrayInt, i, tmp, indexTmp, 1);
                indexTmp++;
            } else continue;
        }
        tmp = Arrays.copyOf(tmp, indexTmp);
        int tmpCount = tmp.length;
        for (int i = 0; i < tmpCount; i++) {
            int countColum = 0;
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j][i] == 0) countColum++;
            }
            if (countColum == tmp.length) {
                for (int j = 0; j < tmp.length; j++) {
                    System.arraycopy(tmp[j], i + 1, tmp[j], i, tmp[j].length - 1);
                    tmp[j] = Arrays.copyOf(tmp[j], tmp[j].length - 1);
                }
                tmpCount--;
            }
        }
        System.arraycopy(tmp, 0, arrayInt, 0, tmp.length);
        arrayInt = Arrays.copyOf(arrayInt, tmp.length);
        return arrayInt;
    }

    public static void shiftZeroElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = 0; k < array[i].length - 1; k++) {
                    if (array[i][k] == 0) {
                        int tmp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = tmp;
                    }
                }
            }
        }
    }
}