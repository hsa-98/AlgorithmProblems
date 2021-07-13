import java.util.Collections;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter the num of elements in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number");
            array[i]=sc.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        array=insertionSort.insertionSort(array);
        for (int j = 0;j<n;j++) {
            System.out.println(array[j]);
        }


    }
    public <E extends Comparable<E>> E[] insertionSort(E[] array){
        for(int i = 1; i < array.length ; i++){
            int hole = i;
            E val = array[i];
            while(hole > 0 && array[hole-1].compareTo(val)>0 ){
                array[hole]=array[hole-1];
                hole=hole-1;
            }
            array[hole]=val;
        }
        return array;

    }
}
