package org.itmo.java.lesson4;

import java.util.Arrays;

public class SortArray {
    /*    что такое О - время рботы зависимость выполнения кода 20-24
     *    рекурсия - метод когда метод вызывает сам себя
     */
    public static void main(String[] args) {
        int[] ints = {99, 88, 77, 66, 55, 44, 33};
//        bubbleSortedArray(ints);
        int[] ints1 = mergeSort(ints);
        System.out.println(Arrays.toString(ints1));
    }


    public static int[] bubbleSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int aj = array[j];
                    int ai = array[i];
                    array[j] = ai;
                    array[i] = aj;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] mergeSort(int[] array) {
//        System.out.println(Arrays.toString(array));

        if (array.length < 2) {
            return array;
        }

        int midArr = array.length / 2;
        int[] left = new int[midArr];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[midArr];
        } else {
            right = new int[midArr + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = array[midArr + j];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length){
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }


            } else if (leftPointer < left.length) {
                    result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}