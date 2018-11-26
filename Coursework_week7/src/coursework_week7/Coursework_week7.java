/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_week7;

/**
 *
 * @author leung
 */
public class Coursework_week7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {30, 13, 22, 90};
        printArray(arr);
        printArray(bubbleSort(arr));
        int[] arri = {30, 13, 22, 90};
        printArray(arri);
        printArray(selectionSort(arri));
        int[] arrj = {30, 13, 22, 90};
        printArray(arrj);
        printArray(quickSort(arr, 0, arrj.length -1));
        

    }
    public static void printArray(int[] arr) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

    public static int[] bubbleSort(int[] arr1) {
        int[] bSArr = arr1;
        int n = arr1.length;
        int temp = 0;
        int compare = 0;
        int swap = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                compare++;
                if (arr1[j - 1] > arr1[j]) {
                    temp = arr1[j - 1];
                    bSArr[j - 1] = arr1[j];
                    bSArr[j] = temp;
                    swap++;
                }

            }
        }
        System.out.println("BubbleSort compare " +compare +" times and swap "+swap +" times.");
        return bSArr;
    }

    public static int[] selectionSort(int[] arr2) {
        int n = arr2.length;
        int[] sSArr = arr2;
        int compare = 0;
        int swap = 0;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                compare++;
                if (arr2[j] < arr2[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr2[min_idx];
            sSArr[min_idx] = arr2[i];
            sSArr[i] = temp;
            swap++;
        }
        System.out.println("Selection Sort compare "+compare+" times and swap "+swap+" times");
        return sSArr;
    }
    
    public static int partition(int[] arr3, int low, int high)
    {
        int pivot = arr3[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
            
            if (arr3[j] <= pivot)
            {
                i++;
 
                int temp = arr3[i];
                arr3[i] = arr3[j];
                arr3[j] = temp;
            }
        }
        int temp = arr3[i+1];
        arr3[i+1] = arr3[high];
        arr3[high] = temp;
 
        return i+1;
    }
 
 
  
    public static int[] quickSort(int[] arr4, int low, int high){
        int[] qSArr = arr4;
        if (low < high)
        {
            int pi = partition(qSArr, low, high);
 
            quickSort(qSArr, low, pi-1);
            quickSort(qSArr, pi+1, high);
        }
        return qSArr;
    }
}
