package com.company;

public class BubbleSort {
    void bubbleSort(int[] myArr) {
        int arrLen = myArr.length;
        for (int i = 0; i < arrLen-1; i++)
            for (int j = 0; j < arrLen-i-1; j++)
                if (myArr[j] > myArr[j+1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j+1];
                    myArr[j+1] = temp;
                }
    }

    void printArray(int[] myArr) {
        for (int j : myArr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] myArr = {9,4,6,7,6,3,6,2,1,1};
        bubbleSort.bubbleSort(myArr);
        System.out.print("Sorted array: ");
        bubbleSort.printArray(myArr);
    }
}
