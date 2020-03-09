package main.java;

public class bubblesort {

    public void bubblesort(int array[]) {

        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j=1])
                {
                    //swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                }
    }

    //prints the sorted array
    public void printArray(int sortedArr[])
    {
        int n = sortedArr.length;
        for (int i=0; i<n; ++i)
        System.out.print(sortedArr[i] + " ");

    }
}
