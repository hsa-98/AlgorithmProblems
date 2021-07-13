import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
    static String [] words = {"Apple","Oranges","Papaya","Pumpkin","Mushroom","Guava"};
    static Integer [] nums = {1,2,3,4,5,6,7,8,9,10,12,445,66,78,108};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.sort(words);
        System.out.println("Enter the word");
        String word = scanner.next();
        BinarySearchWord binarySearchWord = new BinarySearchWord();
        binarySearchWord.binary(word,words);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        binarySearchWord.binary(num,nums);

    }
    public <E extends Comparable<E>> void binary(E word,E[] words){
        int first = 0;
        int last = words.length-1;
        while(first<=last) {
            int mid = (first + last) / 2;
            if (words[mid].compareTo(word) < 0) {
                first = mid + 1;
            } else if (words[mid].compareTo(word) > 0) {
                last = mid - 1;
            } else {
                if (words[mid].compareTo(word) == 0) {
                    System.out.println("The word " + word + " is found");
                    break;
                }
            }
        }
        if(first > last){
            System.out.println("Element not found");
        }

    }

}
