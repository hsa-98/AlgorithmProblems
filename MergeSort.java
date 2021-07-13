import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Enter the num of elements in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number");
            array[i] = sc.nextInt();
        }
        MergeSort mergeSort = new MergeSort();
         mergeSort.mergeSort(array);
        for (int j = 0; j < n; j++) {
            System.out.println(array[j]);
        }

    }
    public void  mergeSort(Integer [] array){
        int n = array.length;
        if(n<2){
            return;
        }
        int mid = n/2;
        Integer[]left = new Integer[mid];
        Integer[]right = new Integer[n-mid];
        for(int i = 0; i<mid;i++){
            left[i]=array[i];
        }
        for (int j= 0;j<right.length;j++){
            right[j]=array[j+mid];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }
    public void merge(Integer[]left,Integer[]right,Integer[]array){
        int i =0;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                array[k]=left[i];
                i++;
            }
            else {
                array[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            array[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            array[k]=right[j];
            j++;
            k++;
        }
    }
}
