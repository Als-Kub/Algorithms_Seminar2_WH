/*
Урок 2. Структуры данных. Массивы. Алгоритмы массивов.

Реализовать сортировку подсчетом
[1 2 3 3 2 3 4 2 1 1 2 3 4 4 2 3 1 4 2 3 4 2 1 2 3 4 2 1 3 4 2 1 2 3 4 4 2 3 3 2 4]
 
 */


import java.util.Arrays;
 
public class sorting {

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2, 3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 2, 1, 3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4 };
 
        int maxNum = 4;
        System.out.println(Arrays.toString(arr));
        countsort(arr, maxNum);
        System.out.println(Arrays.toString(arr));     
    }

    public static void countsort(int[] arr, int maxNum)
    {

        int[] freq = new int[maxNum + 1];
 
        for (int i: arr) {
            freq[i]++;
        }
 
        int index = 0;
        for (int i = 0; i < maxNum + 1; i++)
        {
            while (freq[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
 

}