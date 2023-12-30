package pro.sky.javacoursepart2.sortPractice;

import java.util.Random;

public class SortPractice {
    final int CAPACITY = 100_000;
    public int[] intArr = new int[CAPACITY];
    public static void main(String[] args) {
        SortPractice obj = new SortPractice();
        obj.setIntArray();

        int[] arr1 = obj.intArr.clone();
        int[] arr2 = obj.intArr.clone();
        int[] arr3 = obj.intArr.clone();

        long start;

        start = System.currentTimeMillis();
        sortBubble(arr1); // 12s - slowest
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        sortSelection(arr2); // 3s - medium
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        sortInsertion(arr3); // 0.5s - fastest
        System.out.println(System.currentTimeMillis() - start);

    }

    private void setIntArray() {
        Random rand = new Random();
        for (int i = 0; i < CAPACITY; i++) {
            rand.nextInt();
            intArr[i] = rand.nextInt();
        }
    }

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }

    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }

    public static void sortInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

}
