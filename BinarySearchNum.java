import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class BinarySearchNum {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchNum binarySearchNum = new BinarySearchNum();
        System.out.println("Think of a  number and enter range");
        int num = scanner.nextInt();
        Integer [] words = new Integer[num];
        for(int i=0; i<num;i++){
            words[i]=i+1;
        }
        binarySearchNum.binary(num,words);

    }
    public <E extends Comparable<E>> void binary(int last,E[] words){
        int first = 0;
        while(first<=last) {
            int mid = (first + last) / 2;
            System.out.println("1) your num greater is greater than"+mid);
            System.out.println("2)your num is less than "+mid);
            System.out.println("3)your num is "+mid);
            int choice = scanner.nextInt();
            if (choice == 1) {
                first = mid + 1;
            } else if (choice == 2) {
                last = mid - 1;
            } else {
                if (choice == 3) {
                    System.out.println("The number is "+mid);
                    break;
                }
            }
        }
        if(first > last){
            System.out.println("Element not found");
        }

    }
}
