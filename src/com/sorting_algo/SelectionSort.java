package com.sorting_algo;

public class SelectionSort {

    void sort(int[] myArr){
        int lenArr = myArr.length;
        for (int i = 0; i < lenArr-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < lenArr; j++)
                if (myArr[j] < myArr[min_idx])
                    min_idx = j;
            int temp = myArr[min_idx];
            myArr[min_idx] = myArr[i];
            myArr[i] = temp;
        }
    }

    void printArray(int[] myArr){
        for (int j : myArr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        SelectionSort selectionSort = new SelectionSort();
        int[] myArr = {1,4,5,3,5,53,35,5};
        selectionSort.sort(myArr);
        System.out.println("Sorted array");
        selectionSort.printArray(myArr);
    }

}
