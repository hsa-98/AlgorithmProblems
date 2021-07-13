import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the num of elements in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number");
            array[i] = sc.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        array = bubbleSort.bubbleSort(array);
        for (int j = 0; j < n; j++) {
            System.out.println(array[j]);
        }
    }
    public <E extends Comparable <E>> E[] bubbleSort(E[] array){
        for(int i=1; i<array.length;i++){
            int flag = 1;
            for (int j = 0; j < array.length-i;j++){
                if(array[j].compareTo(array[j+1])>0){
                    System.out.println("why");
                    E temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=0;
                }
            }
            if(flag == 1){
                System.out.println("ok");
                break;
            }
        }
        return array;
    }
}

